package assignment2.in;

	import java.util.Scanner;

	public class Program2 {
	  public static void acceptRecord(int[] arr) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter 5 integers:");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        scanner.close();
	    }

	    public static void printRecord(int[] arr) {
	        System.out.println("The array elements are:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println(); 
	    }

	    public static void main(String[] args) {

	        int[] arr = new int[5];
	  
	        acceptRecord(arr);

	        printRecord(arr);
	        
	    }
	    
	}
