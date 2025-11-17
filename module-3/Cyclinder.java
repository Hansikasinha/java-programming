class Cylinder {
    private double radius;
    private double height;

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }
}

public class Cylinder {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.setRadius(7.5);
        c.setHeight(12.3);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());
    }
}

