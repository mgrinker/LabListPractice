
package lablistpractice;
import java.util.*;
/**
 * Class with Employee and Dog objects in an ArrayList
 * @author Michael
 */
public class StartUpDog {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Fred", "Smith", "A101");
        Employee emp2 = new Employee("Bob", "Jones", "C509");
        Employee emp3 = new Employee("Mary", "Modder", "E098");
        
        Dog d1 = new Dog("Fido", "a");
        Dog d2 = new Dog("Max", "b");
        Dog d3 = new Dog("Fido", "a");
        
        List ed = new ArrayList();
        ed.add(emp1);
        ed.add(emp2);
        ed.add(emp3);
        ed.add(d1);
        ed.add(d2);
        ed.add(d3);
        
        // Not sure how to make this work
        // Two different type objects
        for(int i=0; i < ed.size(); i++) {
            Employee item = (Employee)ed.get(i);
            System.out.println(item.getFirstName());  
        }       
    }
}
