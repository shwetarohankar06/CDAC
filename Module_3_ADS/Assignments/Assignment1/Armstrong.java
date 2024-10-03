import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        
        int n1 = num;
        int result = 0, rem, n = 0;
 
        while (num != 0) {
            num /= 10;
            n++;
        }  
        num = n1;
        while (num != 0) {
            rem = num % 10;
            result += Math.pow(rem, n); 
            num /= 10;
        }
        if (n1 == result) {
            System.out.println(n1 + " is an Armstrong number.");
        } else {
            System.out.println(n1 + " is not an Armstrong number.");
        }
    }
}