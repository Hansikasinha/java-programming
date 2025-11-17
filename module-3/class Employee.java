class Employee {
    // Properties
    private int salary;
    private String name;

    // Constructor
    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    // Method: getSalary
    public int getSalary() {
        return salary;
    }

    // Method: getName
    public String getName() {
        return name;
    }

    // Method: setName
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(50000, "John");

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        emp.setName("David");
        System.out.println("Updated Name: " + emp.getName());
    }
}
