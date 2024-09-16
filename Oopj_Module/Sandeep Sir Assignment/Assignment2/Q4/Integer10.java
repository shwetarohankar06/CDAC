public class Integer10 {
    public static void main(String[] args) {
        int number = 7;
        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String hex = Integer.toHexString(number);
        System.out.println("Binary representation of 7: " + binary);
        System.out.println("Octal representation of 7: " + octal);
        System.out.println("Hexadecimal representation of 7: " + hex);
    }
}
