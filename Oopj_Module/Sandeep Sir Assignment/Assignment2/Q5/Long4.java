public class StringToLong {
    public static void main(String[] args) {
        String strNumber = "54321"; // Method-local variable
        long number = Long.parseLong(strNumber); // Conversion to long
        System.out.println("Converted long value: " + number);
    }
}
