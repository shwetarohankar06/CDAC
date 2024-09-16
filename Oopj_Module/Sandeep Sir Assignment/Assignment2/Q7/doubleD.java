/*d. Declare a method-local variable number of type double with some value and convert it to a String using the toString method. (Hint: Use Double.toString(double)).*/

public class doubleD {
    public static void main(String[] args) {
        double number = 123.456;
        String strNumber = Double.toString(number);
        System.out.println("String representation of the double value: " + strNumber);
    }
}
