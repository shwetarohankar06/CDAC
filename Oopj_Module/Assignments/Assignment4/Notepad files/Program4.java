public class {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = intValue;   // int to double
        float floatValue = intValue;     // int to float
        String stringValue = Integer.toString(intValue); // int to String
        boolean booleanValue = (intValue != 0); // int to boolean
        
        System.out.println("Original int value: " + intValue);
        System.out.println("Converted to double: " + doubleValue);
        System.out.println("Converted to float: " + floatValue);
        System.out.println("Converted to String: " + stringValue);
        System.out.println("Converted to boolean: " + booleanValue);
    }
}
