package assignment2.in;

import java.util.Scanner;

public class Program3 {

    public static int findMax(int[] arr) {
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }
        return max;
    }
    public static int findMin(int[] arr) {
        int min = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; 
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = findMax(arr);
        int min = findMin(arr);
        
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
        scanner.close();
    }
}
