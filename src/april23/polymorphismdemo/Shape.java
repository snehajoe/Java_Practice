package april23.polymorphismdemo;

public class Shape {
    double area = 0;
    public void getArea() {
        System.out.println("Area of the shape: " + area);
    }


    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        rect.getArea();
        cir.getArea();
    }
}