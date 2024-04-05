package march23;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x= scanner.nextInt();
        //int first = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter the value of y:");  //to print on same line remove ln frm println
        int y = scanner.nextInt();

        //String name= scanner.next();
        // -->only reads the first word, to read full line or multiple words use nextLine()

        int sum = x+y;
        int prod = x*y;
        double div= (double)x/y;
        System.out.println("The sum is: "+ sum);
        System.out.println("The product is: "+ prod);
        System.out.println("The quotient is: "+ div);


        scanner.close();

    }
}
