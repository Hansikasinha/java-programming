// Base class
class Employee {
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Derived class
class Manager extends Employee {
    String department;

    // Constructor
    Manager(String name, double salary, String department) {
        super(name, salary); // Call the constructor of Employee
        this.department = department;
    }

    // Override displayInfo to include department
    @Override
    void displayInfo() {
        super.displayInfo(); // Call Employee's displayInfo
        System.out.println("Department: " + department);
    }
}

// Main class
public class Company {
    public static void main(String[] args) {
        // Create a Manager object
        Manager mgr = new Manager("Alice", 75000, "HR");

        // Display all details
        mgr.displayInfo();
    }
}

