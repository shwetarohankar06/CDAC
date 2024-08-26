//6.	Write a program to find and print the first 5 prime numbers.

public class First5Primes {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        System.out.println("First 5 prime numbers:");
        while (count < 5) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
