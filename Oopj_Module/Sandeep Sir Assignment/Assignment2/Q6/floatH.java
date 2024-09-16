/*h. Declare a method-local variable strNumber of type String with some float value and convert it to the corresponding wrapper class using Float.valueOf(). (Hint: Use Float.valueOf(String)).*/
public class floatH {
    public static void main(String[] args) {
        String strNumber = "123.45";
        Float floatWrapper = Float.valueOf(strNumber);
        System.out.println("String to Float wrapper: " + floatWrapper);
    }
}
