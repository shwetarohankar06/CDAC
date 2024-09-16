/*j. Declare two double variables with values 112.2 and 556.6, and find the minimum and maximum values using the Double class. (Hint: Use Double.min(double, double) and Double.max(double, double)).*/
public class doubleJ {
    public static void main(String[] args) {
        double num1 = 112.2;
        double num2 = 556.6;
        double min = Double.min(num1, num2);
        double max = Double.max(num1, num2);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
