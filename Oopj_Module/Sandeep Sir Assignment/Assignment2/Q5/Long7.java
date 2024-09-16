public class StringToWrapper {
    public static void main(String[] args) {
        String strNumber = "67890"; // Method-local variable
        Long longWrapper = Long.valueOf(strNumber); // Conversion to Long wrapper class
        System.out.println("Long wrapper object: " + longWrapper);
    }
}
