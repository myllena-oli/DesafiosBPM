package exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Exercise1 exercise = new Exercise1();
        Scanner scanner = new Scanner(System.in);
        int number1 = exercise.readNumber(scanner, "first");
        int number2 = exercise.readNumber(scanner, "second");

        exercise.compareNumbers(number1, number2);
    }

    public int readNumber(Scanner scanner, String order) {
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the " + order + " number: ");
                number = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
        }

        return number;
    }

    public void compareNumbers(int number1, int number2) {
        if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else if (number2 > number1) {
            System.out.println(number2 + " is greater than " + number1);
        } else {
            System.out.println("The numbers are equal.");
        }
    }
}
