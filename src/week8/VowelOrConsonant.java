package week8;
/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 */

import java.util.Scanner;

public class VowelOrConsonant {

    // Method to check if the input is a vowel or consonant

    public static void checkVowelOrConsonant(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Alphabet :");
        String input = scanner.nextLine();

        // Check if input is a single character
        if(input.length() != 1){
            System.out.println("Error : Please enter single character.");
        }else {
            char ch = input.charAt(0);

            // Check if character is a letter
            if (!Character.isLetter(ch)) {
                System.out.println("Error : Input is not letter.");
            } else {
                // Convert to lowercase to handle both uppercase and lowercase inputs
                ch = Character.toLowerCase(ch);

                // Check if the character is a vowel or consonant
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Input letter is Vowel");

                } else {
                    System.out.println("Input letter is Consonant");
                }

            }
        }
    scanner.close();
    }

    public static void main(String[] args) {
        // Call the login method to check if input is a vowel or consonant
        checkVowelOrConsonant();
    }

}
