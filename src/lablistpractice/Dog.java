package lablistpractice;
/**
 * A dog class that holds the dogs name and rabies Id
 * @author mgrinker
 */
public class Dog {
    private String name;
    private String rabiesId;

    public Dog(String name, String rabiesId) {
        this.name = name;
        this.rabiesId = rabiesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRabiesId() {
        return rabiesId;
    }

    public void setRabiesId(String rabiesId) {
        this.rabiesId = rabiesId;
    }
    
    
}
