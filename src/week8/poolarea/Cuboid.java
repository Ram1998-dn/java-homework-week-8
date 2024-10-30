package week8.poolarea;

/**
 * Write a class with the name Cuboid that extends Rectangle class. The class needs one field
 * (instance variable) with name height of type double.
 * The class needs to have one constructor with three parameters width, length, and height all of type
 * double. It needs to call the parent constructor and initialize a height field.
 * In case the height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getHeight without any parameters, it needs to return the value of height
 * field.
 * ● Method named getVolume without any parameters, it needs to return the calculated volume.
 * To calculate volume, multiply the area with height.
 */
public class Cuboid extends Rectangle {
    private double height;

    // Constructor to initialize width, length, and height
    public Cuboid(double width, double length, double height) {
        super(width, length); // Call to the superclass (Rectangle) constructor

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Method to calculate volume
    public double getVolume() {
        return getArea() * height;
    }


    public static void main(String[] args) {
        // Create a Rectangle instance and display its properties
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        // Create a Cuboid instance and display its properties
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}

