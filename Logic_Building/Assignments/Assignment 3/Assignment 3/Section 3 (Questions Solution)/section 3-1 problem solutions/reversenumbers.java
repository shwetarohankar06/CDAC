//4.	Write a program to reverse the digits of the number 1234. The output should be 4321.


public class reversenumbers{
	public static void main(String args[]){
		int number = 1234;
		int reversed = 0;
		while(number != 0){
			int digit = number % 10;
			reversed = reversed* 10+ digit;
			number /= 10;
		}
		System.out.println("reversed number :" +reversed);
	}
}
			