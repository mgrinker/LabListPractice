
package lablistpractice;

/**
 * An employee class that holds first name, last name and Id
 * @author Michael
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String empId;

    public Employee(String firstName, String lastName, String empId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
    
    
    
}
