import java.util.Scanner;

public class DailyDrivingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double milesDriven = scanner.nextDouble();

        System.out.print("Enter cost per gallon of petrol: $");
        double costPerGallon = scanner.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        System.out.print("Enter parking fees per day: $");
        double parkingFees = scanner.nextDouble();

        System.out.print("Enter tolls per day: $");
        double tolls = scanner.nextDouble();

        scanner.close();

        // Calculate the daily driving cost
        double petrolCost = (milesDriven / milesPerGallon) * costPerGallon;
        double totalCost = petrolCost + parkingFees + tolls;

        System.out.println("Daily Driving Cost Calculator");
        System.out.println("Total miles driven per day: " + milesDriven + " miles");
        System.out.println("Cost per gallon of petrol: $" + costPerGallon);
        System.out.println("Average miles per gallon: " + milesPerGallon + " miles/gallon");
        System.out.println("Parking fees per day: $" + parkingFees);
        System.out.println("Tolls per day: $" + tolls);
        System.out.println("Daily driving cost: $" + totalCost);
    }
}
