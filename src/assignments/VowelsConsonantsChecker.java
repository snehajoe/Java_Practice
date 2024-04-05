package assignments;
import java.util.Scanner;

public class VowelsConsonantsChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char c = scanner.next().charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println(c + " is a vowel.");
        } else {
            System.out.println(c + " is a consonant.");
        }

        scanner.close();


        /*public static boolean isVowel(char c) {
            c = Character.toLowerCase(c); // Convert to lowercase for easier comparison
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }*/
    }
}
