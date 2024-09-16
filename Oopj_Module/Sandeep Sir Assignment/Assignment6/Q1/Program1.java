package assignment6.in;

import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println("Default values of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter 5 integers to update the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nUpdated values of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        scanner.close();
    }

}

