import java.util.Scanner;

public class ArrayLeftRotation{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Enter the array elements: ");
		for(int i = 0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		
		System.out.print("Enter the number of positions to rotate: ");
		int d = sc.nextInt();
		d = d % n;
		
		for(int i = 0; i < d; i++){
			leftRotateByOne(arr,n);
		}
		System.out.print("Rotated Array: ");
		for(int i = 0; i< n; i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void leftRotateByOne(int[] arr, int n) {
		int temp = arr[0];  
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];  
        }
        arr[n - 1] = temp;  
    }
}
