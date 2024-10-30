package week8.methodoverriding24;

public class SBI extends Bank{
    // Overriding the method to provide SBI's interest rate

    public int getRateOfInterest() {
        return 8;
    }
}
