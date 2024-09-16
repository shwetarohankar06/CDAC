/*m. Experiment with converting a float value into other primitive types or vice versa and observe the results.*/
public class floatM {
    public static void main(String[] args) {
        float floatValue = 123.45f;
        int intValue = (int) floatValue;
        System.out.println("Float to int: " + intValue);
        double doubleValue = floatValue;
        System.out.println("Float to double: " + doubleValue);
        intValue = 123;
        float floatFromInt = (float) intValue;
        System.out.println("Int to float: " + floatFromInt);
        doubleValue = 123.45;
        float floatFromDouble = (float) doubleValue;
        System.out.println("Double to float: " + floatFromDouble);
    }
}
