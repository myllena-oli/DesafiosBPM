package exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = readLetter(scanner);
        determineLetterType(letter);
    }

    public static char readLetter(Scanner scanner) {
        char letter = ' ';
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a letter: ");
            String input = scanner.next();

            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                letter = input.charAt(0);
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a single letter.");
            }
        }

        return letter;
    }

    public static void determineLetterType(char letter) {
        String vowels = "aeiouAEIOU";

        if (vowels.contains(String.valueOf(letter))) {
            System.out.println("The letter is a vowel.");
        } else {
            System.out.println("The letter is a consonant.");
        }
    }
}


