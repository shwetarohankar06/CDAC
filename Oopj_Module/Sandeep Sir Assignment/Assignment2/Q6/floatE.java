/*e. Declare a method-local variable strNumber of type String with some value and convert it to a float value using the parseFloat method. (Hint: Use Float.parseFloat(String)).*/

public class floatE {
    public static void main(String[] args) {
        String strNumber = "145.45";
        float number = Float.parseFloat(strNumber);
        System.out.println("String to float: " + number);
    }
}
