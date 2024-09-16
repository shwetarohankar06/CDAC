package assignment5.in;


import java.util.*;

public class Program5{

    // Method to find the intersection of two arrays
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        List<Integer> intersection = new ArrayList<>();
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !intersection.contains(arr1[i])) {
                    intersection.add(arr1[i]);
                }
            }
        }

        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        
        System.out.println("Enter " + n1 + " integers for the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        
        System.out.println("Enter " + n2 + " integers for the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] intersection = findIntersection(arr1, arr2);
        System.out.println("Intersection of the two arrays: " + Arrays.toString(intersection));
        scanner.close();
    }
}

