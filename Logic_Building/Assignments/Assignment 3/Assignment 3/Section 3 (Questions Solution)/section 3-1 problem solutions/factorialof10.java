//2.	Write a program to compute the factorial of the number 10.

public class factorialof10{
	public static void main(String arge[]){
		int number = 10;
		long factorial =1;
		for (int i = 1; i<= number;i++){
			factorial *= i;
		}
		System.out.println("factorial of 10;" + factorial);
	}
}


