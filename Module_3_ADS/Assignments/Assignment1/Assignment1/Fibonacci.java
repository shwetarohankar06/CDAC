import  java.util.Scanner;
public class FibonacciSeries{
	public static void main(String[] arge){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for fibseq: ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		
		System.out.println(" fibonacci series: ");
		
		for(int i = 1; i<=n;i++){
			System.out.println(a);
			int c = a+b;
			a = b;
			b = c;
		}
	sc.close();
	}
	
}