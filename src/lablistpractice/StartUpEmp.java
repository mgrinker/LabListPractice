
package lablistpractice;
import java.util.*;
/**
 * A start up employee class that adds 3 employee objects into
 * an ArrayList, loops through the array and outputs to console
 * @author Michael
 */
public class StartUpEmp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Fred", "Smith", "A101");
        Employee emp2 = new Employee("Bob", "Jones", "C509");
        Employee emp3 = new Employee("Mary", "Modder", "E098");

        List<Employee> emp = new ArrayList<Employee>();
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);

        for(Employee e :emp) {
            System.out.println("Employee name: " + e.getFirstName() + " " +
                    e.getLastName());
            System.out.println("Employee Id: " + e.getEmpId());
            System.out.println("");
        }        
    }
}
