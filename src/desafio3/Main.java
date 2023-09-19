package desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        InputReader inputReader = new InputReader(scanner);
        int distance = inputReader.readDistance();
        double fuel = inputReader.readFuel();

        if (fuel != 0) {

            ConsumptionCalculator calculator = new ConsumptionCalculator();
            double averageConsumption = calculator.calculateAverageConsumption(distance, fuel);

            OutputPrinter outputPrinter = new OutputPrinter();
            outputPrinter.printAverageConsumption(averageConsumption);

        } else {
            OutputPrinter outputPrinter = new OutputPrinter();
            outputPrinter.printInvalidFuelMessage();
        }
    }
}
