/*f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a float value. (Hint: parseFloat method will throw a NumberFormatException).*/
public class floatF {
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3"; 
        float number = Float.parseFloat(strNumber);
        System.out.println("Converted value: " + number);
    }
}
