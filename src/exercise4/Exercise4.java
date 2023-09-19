package exercise4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double grade = readGrade(scanner);
        determineStatus(grade);

    }

    public static double readGrade(Scanner scanner) {
        double grade = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the grade between 0 and 10: ");
                grade = scanner.nextDouble();

                if (grade >= 0 && grade <= 10) {
                    validInput = true;
                } else {
                    System.out.println("The grade must be between 0 and 10.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }

        return grade;
    }

    public static void determineStatus(double grade) {

        if (grade >= 8) {
            System.out.println("Passed.");
        } else if (grade >= 6) {
            System.out.println("In recovery.");
        } else {
            System.out.println("Failed.");
        }
    }
}

