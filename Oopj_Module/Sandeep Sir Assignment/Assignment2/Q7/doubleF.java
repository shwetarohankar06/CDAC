/*f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a double value. (Hint: parseDouble method will throw a NumberFormatException).*/
public class doubleF {
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3"; // Declare method-local variable with the given value

        float number = Float.parseFloat(strNumber);
        System.out.println("Converted value: " + number);
    }
}
