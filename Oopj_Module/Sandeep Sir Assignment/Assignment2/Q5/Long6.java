public class LongToWrapper {
    public static void main(String[] args) {
        long number = 97642L; // Method-local variable
        Long longWrapper = Long.valueOf(number); // Conversion to Long wrapper class
        System.out.println("Long wrapper object: " + longWrapper);
    }
}
