package march30;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*int sum =0;
        int num = 1;
        while(num<=10){
            sum += num;
            num++;
        }
        System.out.println(sum);*/


        int sum=0, num=1;
        do{
            sum+= num;
            num++;
        }while(num<=10);
        System.out.println("Sum of numbers 1-10 = "+sum);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int sumn=0;
        int i=0;

        while(i<=n){
            sumn += i;
            i++;
        }
        System.out.println("Sum of numbers 1-"+ n+ " = "+sumn);

    }
}


