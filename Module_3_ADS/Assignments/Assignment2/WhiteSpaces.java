import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = removeWhiteSpaces(input);
        System.out.println("String after removing white spaces: \"" + result + "\"");
    }

    public static String removeWhiteSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }
}
