//11.	Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression

public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = ++a + b-- - --b;
        System.out.println("Result of the expression ++a + b-- - --b: " + result);
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}
