// Q.1) Write a program to create an Employee class with attributes
// name, id, and salary. Add a method to display the details.

// Create Employee class to perform the operations
public class Employee {
//    Set attributes
    public String name;
    public int id;
    public int salary;

//    Create Constructor
    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


//    Create method to display Employee details
    public void displayEmployeeDetails(){
//        Display result
        System.out.println("\nEmployee name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee salary: " + salary);
    }
}

class EmployeeDetails{
    public static void main(String[] args) {
//        Create multiple objects of Employee class to get different employee details
        Employee emp1 = new Employee("Adarsh", 18, 69000);
        Employee emp2 = new Employee("Abhishek", 15, 62000);
        Employee emp3 = new Employee("Sahil", 20, 20000);

//        Call the method from Employee class to get different employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();

    }
}
