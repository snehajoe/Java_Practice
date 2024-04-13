package april13;
import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no.of Rows:");
        int i= scanner.nextInt();
        System.out.println("Enter the no.of Columns:");
        int j= scanner.nextInt();

        int[][] arr = new int[i][j];

        for (i=0; i<arr.length; i++){           //rows
            for(j=0; j<arr.length; j++){         //columns
                System.out.println("Enter the element:");
                int k = scanner.nextInt();
                arr[i][j] = k;
            }
        }

        System.out.println("Printing the elements of first array: ");
        for (int a=0; a<arr.length; a++){
            for(int b=0; b<arr.length; b++){
                System.out.print(arr[a][b]+ " ");
            } System.out.println(" ");
        }


    }
}
