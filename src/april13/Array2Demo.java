package april13;
import java.util.Scanner;

public class Array2Demo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        for (int i=0; i<arr.length; i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("Printing the elements of array: ");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
