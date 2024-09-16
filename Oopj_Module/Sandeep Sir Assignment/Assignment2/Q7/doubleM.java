/*m. Experiment with converting a double value into other primitive types or vice versa and observe the results.*/

public class doubleM {
    public static void main(String[] args) {
        double number = 123.456;

        int intValue = (int) number;
        float floatValue = (float) number;
        long longValue = (long) number;

        System.out.println("Double value: " + number);
        System.out.println("Converted to int: " + intValue);
        System.out.println("Converted to float: " + floatValue);
        System.out.println("Converted to long: " + longValue);
    }
}
