package assignment6.in;

import java.util.*;

public class Program6 {

    // Method 
    public static int findMissingNumber(int[] arr, int N) {
        int expectedSum = N * (N + 1) / 2;  // Sum of numbers from 1 to N
        int Sum = 0;
        
        for (int num : arr) {
          Sum += num;
        }

        return expectedSum - Sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N (the range): ");
        int N = scanner.nextInt();
        int[] arr = new int[N - 1];  // Array size is N-1 as one number is missing
        
        System.out.println("Enter " + (N - 1) + " integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int missingNumber = findMissingNumber(arr, N);
        System.out.println("The missing number is: " + missingNumber);
        
        scanner.close();
    }
}
