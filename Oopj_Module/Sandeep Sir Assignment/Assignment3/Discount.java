package exp.java;

import java.util.Scanner;

class DiscountCalculator {
	private double originalPrice;
	private double discountRate;
	private double discountAmount;
	private double finalPrice;

	Scanner sc = new Scanner(System.in);

	public void acceptRecord() {

		System.out.print("Enter original price  : ");
		originalPrice = sc.nextDouble();
		System.out.print("Enter discount Rate   :  ");
		discountRate = sc.nextDouble();
	}

	public void calculateDiscount() {
		discountAmount = originalPrice * (discountRate / 100);
		finalPrice = originalPrice - discountAmount;
	}

	public void printRecord() {
		System.out.printf("Discount Amount: ₹%.2f\n", discountAmount);
		System.out.printf("Final Price after Discount: ₹%.2f\n", finalPrice);
	}

	public static void main(String[] args) {
		DiscountCalculator calculator = new DiscountCalculator();
		calculator.acceptRecord();
		calculator.calculateDiscount();
		calculator.printRecord();
	}

}
