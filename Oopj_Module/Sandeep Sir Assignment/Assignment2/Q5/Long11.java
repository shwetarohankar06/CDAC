public class long11 {
    public static void main(String[] args) {
        long num =1245679L;

        int intValue = (int) num;
        short shortValue = (short) num;
        byte byteValue = (byte) num;
        double doubleValue = (double) num;
        float floatValue = (float) num;

        System.out.println("Original long value: " + num);
        System.out.println("Converted to int: " + intValue);
        System.out.println("Converted to short: " + shortValue);
        System.out.println("Converted to byte: " + byteValue);
        System.out.println("Converted to double: " + doubleValue);
        System.out.println("Converted to float: " + floatValue);
    }
}
