package week8;

/**
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 * fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 * fields.
 * Write the following methods (instance methods):
 *  Method named getX without any parameters, it needs to return the value of x field.
 *  Method named getY without any parameters, it needs to return the value of y field.
 *  Method named setX with one parameter of type int, it needs to set the value of the x field.
 *  Method named setY with one parameter of type int, it needs to set the value of the y field.
 *  Method named distance without any parameters, it needs to return the distance between this
 * Point and Point 0,0 as double.
 *  Method named distance with two parameters x, y both of type int, it needs to return the distance
 * between this Point and Point x,y as double.
 *  Method named distance with parameter another of type Point, it needs to return the distance
 * between this Point and another Point as double.
 * How to find the distance between two points?
 * To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 * Where √ represents square root.
 */
public class Point {
    // Fields for the Point class
    private int x;
    private int y;

    // No-argument constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor with parameters
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get the x value
    public int getX() {
        return x;
    }

    // Method to get the y value
    public int getY() {
        return y;
    }

    // Method to set the x value
    public void setX(int x) {
        this.x = x;
    }

    // Method to set the y value
    public void setY(int y) {
        this.y = y;
    }

    // Method to calculate distance from (0, 0)
    public double distance() {
        return distance(0, 0);
    }

    // Method to calculate distance from (x, y)
    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    // Method to calculate distance from another Point
    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }

    // Main method to test the Point class
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
