import java.util.Scanner;

public class GCD {
	
	   // GCD using subtraction
    private static int findGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b; 
            } else {
                b = b - a; 
            }
        }
        return a; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int gcd = findGCD(a, b);

        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);

        sc.close();
    }

    
}
