package week8.encapsulation26;

public class Encapsulate {
    // Private variables declared, these can only be accessed by public methods of the class
    private String name;
    private int rollNo;
    private int age;

    // Get method for name to access the private variable name
    public String getName() {
        return name;
    }

    // Set method for name to access the private variable name
    public void setName(String name) {
        this.name = name;
    }

    // Get method for rollNo to access the private variable rollNo
    public int getRollNo() {
        return rollNo;
    }

    // Set method for rollNo to access the private variable rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Get method for age to access the private variable age
    public int getAge() {
        return age;
    }

    // Set method for age to access the private variable age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        // Setting values of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);

        // Displaying values of the variables
        System.out.println("Student's name: " + obj.getName());
        System.out.println("Student's age: " + obj.getAge());
        System.out.println("Student's roll number: " + obj.getRollNo());

        // Direct access of rollNo is not possible due to encapsulation
        // Uncommenting the next line will cause a compilation error
        // System.out.println("Student's rollNo : " + obj.rollNo);

    }
}
