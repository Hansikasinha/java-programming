public class Company {
public static void main(String[] args) {
// Creating object of Manager class
Manager m = new Manager();
// Assigning values directly
m.name = "Ankita";
m.salary = 75000;
m.department = "Human Resources";
// Displaying details
m.displayInfo();
}
}
class Employee {
String name;
double salary;
// Method to display employee info
void displayInfo() {
System.out.println("Name: " + name);
System.out.println("Salary: ₹" + salary);
}
}
// Child class
class Manager extends Employee {
String department;
// Overriding displayInfo() to include 
void displayInfo() {
System.out.println("Name: " + name);
System.out.println("Salary: ₹" + salary);
System.out.println("Department: " +
department);
}
}