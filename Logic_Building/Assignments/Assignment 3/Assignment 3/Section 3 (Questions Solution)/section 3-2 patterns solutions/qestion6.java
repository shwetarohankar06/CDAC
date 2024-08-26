/*17. Write a program to print the following pattern:
* * * * *
 * * * *
  * * *
   * *
    *
	program code:*/
public class InvertedPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = rows - i; k > 0; k--) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
