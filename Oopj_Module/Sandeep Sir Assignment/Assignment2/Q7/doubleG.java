/*g. Declare a method-local variable number of type double with some value and convert it to the corresponding wrapper class using Double.valueOf(). (Hint: Use Double.valueOf(double)).*/

public class doubleG {
    public static void main(String[] args) {
        double number = 789.123;
        Double WD = Double.valueOf(number);
        System.out.println("Double wrapper class object: " + WD);
    }
}
