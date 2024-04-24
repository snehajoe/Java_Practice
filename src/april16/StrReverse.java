package april16;

public class StrReverse {
    public static void main(String[] args) {

        String s ="Pragra";
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


        System.out.println("Reversed string: ");
        System.out.println(chars.toString());

    }
}
