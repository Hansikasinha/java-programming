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

    // Method: Calculate Volume
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    // Method: Calculate Surface Area
    // Total Surface Area = 2πr(h + r)
    public double surfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }
}

public class SurfaceArea {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.setRadius(7);
        c.setHeight(10);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());

        System.out.println("Volume: " + c.volume());
        System.out.println("Surface Area: " + c.surfaceArea());
    }
}
