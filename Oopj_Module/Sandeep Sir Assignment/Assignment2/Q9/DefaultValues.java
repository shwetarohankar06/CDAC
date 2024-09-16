/*9. Default Values of Primitive Types
Declare variables of each primitive type as fields of a class and check their default values. (Note: Default values depend on whether the variables are instance variables or static variables).*/

public class DefaultValues {
    // Instance variables (have default values)
    byte byteVal;
    short shortVal;
    int intVal;
    long longVal;
    float floatVal;
    double doubleVal;
    char charVal;
    boolean booleanVal;

    // Static variables (also have default values)
    static byte staticByteVal;
    static short staticShortVal;
    static int staticIntVal;
    static long staticLongVal;
    static float staticFloatVal;
    static double staticDoubleVal;
    static char staticCharVal;
    static boolean staticBooleanVal;

    public static void main(String[] args) {
        // Create an instance to check instance variable default values
        DefaultValues obj = new DefaultValues();

        // Display default values of instance variables
        System.out.println("Default values of instance variables:");
        System.out.println("byte: " + obj.byteVal);
        System.out.println("short: " + obj.shortVal);
        System.out.println("int: " + obj.intVal);
        System.out.println("long: " + obj.longVal);
        System.out.println("float: " + obj.floatVal);
        System.out.println("double: " + obj.doubleVal);
        System.out.println("char: [" + obj.charVal + "]"); // Displays an empty space
        System.out.println("boolean: " + obj.booleanVal);

        // Display default values of static variables
        System.out.println("\nDefault values of static variables:");
        System.out.println("byte: " + staticByteVal);
        System.out.println("short: " + staticShortVal);
        System.out.println("int: " + staticIntVal);
        System.out.println("long: " + staticLongVal);
        System.out.println("float: " + staticFloatVal);
        System.out.println("double: " + staticDoubleVal);
        System.out.println("char: [" + staticCharVal + "]");
        System.out.println("boolean: " + staticBooleanVal);
    }
}
