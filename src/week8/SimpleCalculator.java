package week8;

/**
 * Sum Calculator
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the
 * firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of
 * the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value
 * of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the
 * value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result
 * of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of
 * dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 */

public class SimpleCalculator {
    protected double firstNumber;
    protected double secondNumber;

    // Getter for firstNumber
    public double getFirstNumber() {
        return firstNumber;
    }

    // Setter for firstNumber
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    // Getter for secondNumber
    public double getSecondNumber() {
        return secondNumber;
    }

    // Setter for secondNumber
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // Method to get the addition result
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    // Method to get the subtraction result
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    // Method to get the multiplication result
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    // Method to get the division result (returns 0 if secondNumber is 0)
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        // Test 1: Set firstNumber to 5.0 and secondNumber to 4
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());          // Output: add= 9.0
        System.out.println("subtract= " + calculator.getSubtractionResult());  // Output: subtract= 1.0

        // Test 2: Set firstNumber to 5.25 and secondNumber to 0
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult()); // Output: multiply= 0.0
        System.out.println("divide= " + calculator.getDivisionResult());        // Output: divide= 0.0
    }
}

