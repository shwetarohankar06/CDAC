/*i. Declare two float variables with values 112.3 and 984.5, and add them using a method from the Float class. (Hint: Use Float.sum(float, float)).*/
public class floatI {
    public static void main(String[] args) {
        float a = 112.3f;
        float b = 984.5f;
        float sum = Float.sum(a, b);
        System.out.println("Sum of 112.3 and 984.5: " + sum);
    }
}
