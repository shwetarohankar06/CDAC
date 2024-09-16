package exe.java;

import java.util.Scanner;

public class TollBoothUtil {

    private static Scanner scanner = new Scanner(System.in); // Single Scanner instance

    public static TollBooth acceptRecord() {
        System.out.print("Enter toll rate for Car : ");
        double carRate = scanner.nextDouble();

        System.out.print("Enter toll rate for Truck : ");
        double truckRate = scanner.nextDouble();

        System.out.print("Enter toll rate for Motorcycle : ");
        double motorcycleRate = scanner.nextDouble();

        TollBooth manager = new TollBooth(carRate, truckRate, motorcycleRate);

        System.out.print("Enter number of Cars: ");
        manager.setCarCount(scanner.nextInt());

        System.out.print("Enter number of Trucks: ");
        manager.setTruckCount(scanner.nextInt());

        System.out.print("Enter number of Motorcycles: ");
        manager.setMotorcycleCount(scanner.nextInt());

        return manager;
    }

    public static void printRecord(TollBooth manager) {
        System.out.println(manager.toString());
    }

    public static void menuList() {
        System.out.println("Toll Booth Revenue Management System");
        System.out.println("1. Accept Toll Rates and Vehicle Counts");
        System.out.println("2. Display Toll Booth Details");
        System.out.println("3. Exit");
    }
}
