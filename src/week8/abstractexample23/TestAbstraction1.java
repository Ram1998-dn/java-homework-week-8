package week8.abstractexample23;

/**
 * Create the fourth class name TestAbstraction1 and inside create the
 * main method as below.
 */
public class TestAbstraction1 {
    public static void main(String[] args) {
        // In a real scenario, this object might be provided by a method like getShape()
        Shape s = new Circle1(); // Polymorphic behavior - Shape reference to a Circle1 object
        s.draw();                // Calls Circle1's implementation of draw()
    }
}
