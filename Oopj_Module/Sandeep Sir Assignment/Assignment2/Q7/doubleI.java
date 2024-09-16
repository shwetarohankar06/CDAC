/*i. Declare two double variables with values 112.3 and 984.5, and add them using a method from the Double class. (Hint: Use Double.sum(double, double)).*/
public class doubleI {
    public static void main(String[] args) {
        double num1 = 112.3;
        double num2 = 984.5;
        double sum = Double.sum(num1, num2);
        System.out.println("Sum of the two double values: " + sum);
    }
}
