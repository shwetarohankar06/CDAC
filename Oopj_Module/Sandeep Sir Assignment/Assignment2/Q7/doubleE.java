/*e. Declare a method-local variable strNumber of type String with some value and convert it to a double value using the parseDouble method. (Hint: Use Double.parseDouble(String)).*/

public class  doubeE{
    public static void main(String[] args) {
        String strNumber = "456.789";
        double number = Double.parseDouble(strNumber);
        System.out.println("Double representation of the string value: " + number);
    }
}

