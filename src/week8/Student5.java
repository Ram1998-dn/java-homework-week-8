package week8;

public class Student5 {
    int id;
    String name;
    int age;

    // Constructor with two parameters
    Student5(int i, String n) {
        id = i;
        name = n;
        age = 0; // Default age when not provided
    }

    // Constructor with three parameters
    Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    // Method to display student details
    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        // Creating objects using different constructors
        Student5 s1 = new Student5(111, "Karan"); // Calls the two-parameter constructor
        Student5 s2 = new Student5(222, "Aryan", 25); // Calls the three-parameter constructor

        // Displaying student details
        s1.display(); // Output: 111 Karan 0
        s2.display(); // Output: 222 Aryan 25
    }
}
