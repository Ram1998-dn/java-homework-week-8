package week8.methodoverriding24;

public class ICICI extends Bank{
    // Overriding the method to provide ICICI's interest rate
    public int getRateOfInterest() {
        return 7;
    }
}
