public class Employee {
    private int salary;
    private String name;
    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
