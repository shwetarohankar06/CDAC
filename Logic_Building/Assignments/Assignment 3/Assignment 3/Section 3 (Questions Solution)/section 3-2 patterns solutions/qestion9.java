/*20. Write a program to print the following pattern:

5
5*4
5*4*3
5*4*3*2
5*4*3*2*1

program code:
*/
public class Pattern{
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
                if (j > i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
