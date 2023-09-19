package desafio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader {
    private final Scanner scanner;

    public InputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public int readDistance() {
        int distance = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("\nEnter the total distance traveled (in Km): ");
                distance = scanner.nextInt();

                if (distance >= 0) {
                    validInput = true;
                } else {
                    System.out.println("\nDistance can't be negative.");
                }


            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }

        return distance;
    }

    public double readFuel() {
        double fuel = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("\nEnter the fuel consumption (in liters): ");
                fuel = scanner.nextDouble();

                if (fuel >= 0) {
                    validInput = true;
                } else {
                    System.out.println("\nFuel consumption can't be negative.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input. Please, enter a valid number.");
                scanner.nextLine();
            }
        }

        return fuel;
    }
}
