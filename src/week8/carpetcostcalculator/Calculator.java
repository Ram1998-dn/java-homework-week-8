package week8.carpetcostcalculator;

/**
 * Write a class with the name Calculator. The class needs two fields (instance variables) with name
 * floor of type Floor and carpet of type Carpet.
 * The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet
 * and it needs to initialize the fields.
 * Write the following methods (instance methods):
 * ● Method named getTotalCost without any parameters, it needs to return the calculated total
 * cost to cover the floor with a carpet.
 */
public class Calculator extends Floor {
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        super(floor.width, floor.length); // Call the Floor constructor
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return getArea() * carpet.getCost();
    }

        public static void main(String[] args) {
            Carpet carpet = new Carpet(3.5);
            Floor floor = new Floor(2.75, 4.0);
            Calculator calculator = new Calculator(floor, carpet);
            System.out.println("total= " + calculator.getTotalCost());

            carpet = new Carpet(1.5);
            floor = new Floor(5.4, 4.5);
            calculator = new Calculator(floor, carpet);
            System.out.println("total= " + calculator.getTotalCost());
        }

    }


