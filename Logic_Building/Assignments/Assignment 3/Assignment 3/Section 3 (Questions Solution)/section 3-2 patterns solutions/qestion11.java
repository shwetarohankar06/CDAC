/*22. Write a program to print the following pattern:
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
*********
*/

public class StarPattern {
    public static void main(String[] args) {
        int n = 5; // Maximum width of the pattern (at the center)
        
        // First part: Upper pyramid create 
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second part: Lower inverted pyramid create
        for (int i = 2; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}