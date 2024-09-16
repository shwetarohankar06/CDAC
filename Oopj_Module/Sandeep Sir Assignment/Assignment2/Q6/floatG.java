/*g. Declare a method-local variable number of type float with some value and convert it to the corresponding wrapper class using Float.valueOf(). (Hint: Use Float.valueOf(float)).*/
public class floatG {
    public static void main(String[] args) {
        float a = 114.2f;
        float b = 656.6f;
        float min = Float.min(a, b);
        float max = Float.max(a, b);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
