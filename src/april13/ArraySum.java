package april13;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int sum=0;
        //int[] arr ={23,44,23,52,54,23,87,87};

        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        for (int i=0; i<arr.length; i++){
            arr[i]= scanner.nextInt();
        }

        for (int i=0; i<arr.length; i++){
            sum+= arr[i];
        }
        System.out.println("Sum of the elements: "+sum);
    }
}
