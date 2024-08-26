//5.	Write a program to print the Fibonacci sequence up to the number 21.

public class Fibonacci{
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println("Fibonacci sequence up to 21:");
        while (a <= 21) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
