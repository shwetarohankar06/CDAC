public class BooleanConversion {
    public static void main(String[] args) {
        String strStatus = "1";  // or "0"
        boolean boolStatus = Boolean.parseBoolean(strStatus);
        System.out.println("Converted boolean value: " + boolStatus);
    }
}
