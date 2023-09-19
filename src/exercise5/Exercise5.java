package exercise5;

import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = readListSize(scanner);

        if (size <= 0) {
            System.out.println("Thank you for using the program. Bye bye...");
            System.exit(0);
        }

        List<Integer> list = readNumbers(scanner, size);

        list.sort(Collections.reverseOrder());

        System.out.println("List sorted in descending order: " + list);
    }

    public static int readListSize(Scanner scanner) {
        int size = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the list size: ");
                size = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }

        return size;
    }

    public static List<Integer> readNumbers(Scanner scanner, int size) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    int number = scanner.nextInt();
                    list.add(number);
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.nextLine();
                }
            }
        }
        return list;
    }
}
