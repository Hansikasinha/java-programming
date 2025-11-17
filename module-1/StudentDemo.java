class Student {
    String name;
    int rollNo;

    void setData(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData("Rahul", 101);
        s1.display();
    }
}
