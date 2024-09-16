/*8. Conversion between Primitive Types and Strings
Initialize a variable of each primitive type with a user-defined value and convert it into String:
	First, use the toString method of the corresponding wrapper class. (e.g., Integer.toString()).
	Then, use the valueOf method of the String class. (e.g., String.valueOf()).*/

import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intVal = sc.nextInt();
        System.out.print("Enter a double: ");
        double doubleVal = sc.nextDouble();
        System.out.print("Enter a boolean: ");
        boolean boolVal = sc.nextBoolean();

        // Converting using toString() method of wrapper classes
        String intToString = Integer.toString(intVal);
        String doubleToString = Double.toString(doubleVal);
        String boolToString = Boolean.toString(boolVal);

        System.out.println("\nConversion using toString() method:");
        System.out.println("Integer as String: " + intToString);
        System.out.println("Double as String: " + doubleToString);
        System.out.println("Boolean as String: " + boolToString);

        // Converting using valueOf() method of String class
        String intValueOf = String.valueOf(intVal);
        String doubleValueOf = String.valueOf(doubleVal);
        String boolValueOf = String.valueOf(boolVal);

        System.out.println("\nConversion using valueOf() method:");
        System.out.println("Integer as String: " + intValueOf);
        System.out.println("Double as String: " + doubleValueOf);
        System.out.println("Boolean as String: " + boolValueOf);
    }
}
