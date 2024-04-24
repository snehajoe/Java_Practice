package april23.polymorphismdemo;
import java.util.Scanner;

public class Rectangle extends Shape {
    Scanner scan = new Scanner(System.in);

    private double length= scan.nextDouble();
    private double breadth = scan.nextDouble();


    public void getArea(){
        double area = length*breadth;
        System.out.println("Area of the rectangle: "+ area);
    }
}
