/*21. Write a program to print the following pattern:

1
1*3
1*3*5
1*3*5*7
1*3*5*7*9

program code:*/

public class Pattern{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num += 2;
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
