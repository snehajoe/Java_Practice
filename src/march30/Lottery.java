package march30;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to My Lottery System");

        for (int i=0; i<3; i++){
            System.out.print("Enter a number between 1-100 : ");
            int n= scanner.nextInt();
            if(n == 55) {
                System.out.println("You won $50000");
                break;
            } else{
                System.out.println("Sorry, Try again");
                continue;
            }

        }
    }
}
