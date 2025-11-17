class Rectangle {
    private int length;
    private int breadth;

    // Default constructor (length = 4, breadth = 5)
    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    // Overloaded constructor (custom values)
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("--------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Rectangle r1 = new Rectangle();
        r1.printDimensions();

        // Using overloaded constructor with custom values
        Rectangle r2 = new Rectangle(10, 20);
        r2.printDimensions();
    }
}
