/*j. Declare two float variables with values 112.2 and 556.6, and find the minimum and maximum values using the Float class. (Hint: Use Float.min(float, float) and Float.max(float, float)).*/
public class floatJ {
    public static void main(String[] args) {
        float a = 112.2f;
        float b = 556.6f;
        float min = Float.min(a, b);
        float max = Float.max(a, b);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
