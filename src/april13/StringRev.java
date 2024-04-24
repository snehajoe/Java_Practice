package april13;
import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s= scan.nextLine();
        //String s ="Pragra";

        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed string: "+ chars.toString());
        /*for (int k = 0; k < chars.length; k++) {
            System.out.print(chars[k]);
        }*/
        //System.out.println(chars);

    }
}