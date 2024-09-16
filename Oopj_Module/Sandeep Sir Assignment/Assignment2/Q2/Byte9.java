/*h. Declare a method-local variable strNumber of type String with some byte value and convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(String)).*/
public class Byte9{
    public static void main(String[] args) {
        String strNumber = "127";
        Byte byteObject = Byte.valueOf(strNumber);
        System.out.println(byteObject);
    }
}