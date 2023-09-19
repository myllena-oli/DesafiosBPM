package desafio3;

public class OutputPrinter {
    public void printAverageConsumption(double averageConsumption) {
        System.out.printf("Average consumption is %.3f km/l\n", averageConsumption);
    }

    public void printInvalidFuelMessage() {
        System.out.println("0.000 km/l\n");
    }
}
