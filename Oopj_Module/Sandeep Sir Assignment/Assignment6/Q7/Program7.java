package assignment.in;

import java.util.Scanner;

class Array {
    private int[] arr;  // Single-dimensional array as a field

    // Constructor to instantiate the array
    public Array(int size) {
        arr = new int[size];  // Instantiate the array 
    }
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            
        }
        scanner.close();
    }
    public void printRecord() {
        System.out.println("Array elements are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }
}

public class Arrray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        Array New= new Array(size);

        New.acceptRecord();
        New.printRecord();
        
        scanner.close();
    }
    
}
