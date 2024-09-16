/*i. Experiment with converting a byte value into other primitive types or vice versa and observe the results.*/
public class Byte10{
    public static void main(String[] args) {
        byte number = 10;
        int intValue = number;
        short shortValue = number;
        long longValue = number;
        float floatValue = number;
        double doubleValue = number;

        System.out.println("Byte value as int: " + intValue);
        System.out.println("Byte value as short: " + shortValue);
        System.out.println("Byte value as long: " + longValue);
        System.out.println("Byte value as float: " + floatValue);
        System.out.println("Byte value as double: " + doubleValue);
    }
}

