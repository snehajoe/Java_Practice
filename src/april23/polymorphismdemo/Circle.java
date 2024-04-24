package april23.polymorphismdemo;
import java.util.Scanner;


public class Circle extends Shape {
    Scanner scan = new Scanner(System.in);

    private double radius;
    public void getArea(){
        System.out.print("Enter the radius: ");
        radius= scan.nextDouble();
        double area = Math.PI* radius*radius;
        System.out.println("Area of the circle: "+ area);

    }
}
