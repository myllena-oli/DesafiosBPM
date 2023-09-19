package desafio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = readIntegerNumber(scanner);

        long factorial = calculateFactorial(number);
        System.out.println(number + "! = " + factorial);

    }

    public static int readIntegerNumber(Scanner scanner) {
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter an integer to calculate the factorial: ");
                number = scanner.nextInt();

                if (number >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Factorial is not defined for negative numbers.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }

        return number;
    }

    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;

        } else {
            long result = 1;
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}