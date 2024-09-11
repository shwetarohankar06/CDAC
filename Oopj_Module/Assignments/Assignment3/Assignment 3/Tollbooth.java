package exp.java;

import java.util.Scanner;

class TollBoothRevenueManager {
	private double carRate;
	private double truckRate;
	private double motorcycleRate;
	private int numCars;
	private int numTrucks;
	private int numMotorcycles;
	private double totalRevenue;

	Scanner sc = new Scanner(System.in);

	public void setTollRates() {

		System.out.print("Enter toll rate for Cars : ");
		carRate = sc.nextDouble();
		System.out.print("Enter toll rate for Trucks : ");
		truckRate = sc.nextDouble();
		System.out.print("Enter toll rate for Motorcycles : ");
		motorcycleRate = sc.nextDouble();
	}

	public void acceptRecord() {
		// Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Cars	: ");
		numCars = sc.nextInt();
		System.out.print("Enter the number of Trucks: ");
		numTrucks = sc.nextInt();
		System.out.print("Enter the number of Motorcycles: ");
		numMotorcycles = sc.nextInt();
	}

	public void calculateRevenue() {
		totalRevenue = (numCars * carRate) + (numTrucks * truckRate) + (numMotorcycles * motorcycleRate);
	}

	public void printRecord() {
		int totalVehicles = numCars + numTrucks + numMotorcycles;
		System.out.println("Total number of vehicles: " + totalVehicles);
		System.out.printf("Total revenue collected: ₹%.2f\n", totalRevenue);
	}
}

public class RevenueManagement {
	public static void main(String[] args) {
		TollBoothRevenueManager manager = new TollBoothRevenueManager();
		manager.setTollRates();
		manager.acceptRecord();
		manager.calculateRevenue();
		manager.printRecord();
	}
}
