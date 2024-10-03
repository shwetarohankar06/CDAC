import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversedWords = reverseWords(input);
        System.out.println("Reversed words: \"" + reversedWords + "\"");
    }
    public static String reverseWords(String str) {
        // Split the input string by spaces to get words
        String[] words = str.split(" ");
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i];
        }

        return reversed;
    }
}
