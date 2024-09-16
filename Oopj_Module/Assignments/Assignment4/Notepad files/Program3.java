public class Program3 {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 5.5;
        float floatValue = 3.3f;
        
        double result1 = intValue + doubleValue;  // int to double
        float result2 = intValue + floatValue;    // int to float
        double result3 = floatValue + doubleValue; // float to double
        
        System.out.println("Result of int + double: " + result1);
        System.out.println("Result of int + float: " + result2);
        System.out.println("Result of float + double: " + result3);
    }
}