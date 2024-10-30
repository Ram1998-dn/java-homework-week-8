package week8.multilevelinheritance23;

public class TestInheritance2 {
    public static void main(String[] args) {
        // Creating an instance of BabyDog
        BabyDog d = new BabyDog();

        // Calling BabyDog's own method
        d.weep();

        // Calling methods inherited from Dog and Animal classes
        d.bark();
        d.eat();
    }
}
