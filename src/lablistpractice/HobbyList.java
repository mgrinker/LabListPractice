
package lablistpractice;
import java.util.*;
/**
 * A hobby ArrayList looped through and printed to console
 * @author mgrinker
 */
public class HobbyList {

    public static void main(String[] args) {
        List hobby = new ArrayList();
        hobby.add("Propeller");
        hobby.add("Wing");
        hobby.add("Controller");
        
        hobby.add(0, "Fuselage");
        
        for(int i=0; i < hobby.size(); i++) {
            String hi = (String)hobby.get(i);
            System.out.println(hi);
        }
    }
}
