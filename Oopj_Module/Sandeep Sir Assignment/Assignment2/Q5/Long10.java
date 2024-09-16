public class long10 {
    public static void main(String[] args) {
        long num = 7;
		
        String binaryString = Long.toBinaryString(num);
        String octalString = Long.toOctalString(num);
        String hexString = Long.toHexString(num);

        System.out.println("Binary representation: " + binaryString);
        System.out.println("Octal representation: " + octalString);
        System.out.println("Hexadecimal representation: " + hexString);
    }
}
