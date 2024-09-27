import java.util.*;
 public class SquareRoot {  
	public static void main (String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number whose square root you want: ");
	double x = sc.nextDouble();
	double ans = (int) Math.sqrt(x);	
	System.out.println(ans);
	}
}
