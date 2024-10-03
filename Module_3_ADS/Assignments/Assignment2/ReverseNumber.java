import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversedNumber = reverseNumber(num);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int n = number % 10;
            reversed = reversed * 10 + n;
            number /= 10;
        }
        return reversed;
    }
}
