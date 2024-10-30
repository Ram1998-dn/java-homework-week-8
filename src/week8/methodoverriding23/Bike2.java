package week8.methodoverriding23;

public class Bike2 extends Vehicle{
    // Overriding the run method of Vehicle class
    @Override
    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        // Creating an object of Bike2
        Bike2 obj = new Bike2();

        // Calling the overridden method
        obj.run(); // This should call the run() method in Bike2
    }
}
