public class Integer11 {
    public static void main(String[] args) {
        int number = 45 ;
        byte byteValue = (byte) number;  // Explicit casting needed
        short shortValue = (short) number;  // Explicit casting
        long longValue = number;
        float floatValue = number;
        double doubleValue = number;

        System.out.println("Int value as byte : " + byteValue); // with casting
        System.out.println("Int value as short : " + shortValue);   //with casting
        System.out.println("Int value as long: " + longValue);
        System.out.println("Int value as float: " + floatValue);
        System.out.println("Int value as double: " + doubleValue);
    }
}
