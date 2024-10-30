package week8.methodoverriding24;

public class Test2 {
    public static void main(String[] args) {
        // Creating instances of each bank
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        // Calling the overridden methods
        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + axis.getRateOfInterest());
    }
}
