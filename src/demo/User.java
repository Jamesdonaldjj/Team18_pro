package demo;

/**
 *
 * @author James
 */
public class User {
    private String name;
    private int level;

    //creates users
    public User(String name, int level) {
        this.name = name;
        this.level = level;
    }

    //get user name
    public String getName() {
        return name;
    }

    //set User name
    public void setName(String name) {
        this.name = name;
    }

    //get User level
    public int getLevel() {
        return level;
    }

    //set User Level
    public void setLevel(int level) {
        if(level > 5){
            this.level = 5;
        }else if(level < 0){
            this.level = 0;
        }else{
            this.level = level;
        }
    }
    
    
}
