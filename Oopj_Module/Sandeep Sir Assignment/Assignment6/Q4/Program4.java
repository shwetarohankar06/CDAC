package assignment4.in;

import java.util.*;
public class Program4 {
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);

        int[] temp = new int[arr.length];
        int j = 0; // Index for the temp array

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
  
        temp[j++] = arr[arr.length - 1];

        int[] uniqueArray = new int[j];
        for (int i = 0; i < j; i++) {
            uniqueArray[i] = temp[i];
        }

        return uniqueArray;
    }

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        // Accept the elements from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Remove duplicates and get the new array
        int[] uniqueArray = removeDuplicates(arr);
        
        // Display the array without duplicates
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
        System.out.println(); 
        scanner.close();
    }
}
