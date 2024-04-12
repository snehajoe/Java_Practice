package april6;

public class Rectangle {
    double length, width;

    Rectangle(){
        length= 5;
        width = 12;
    }

    /*Rectangle(double length, double width){
        this.length=width;
        this.width=length;
    }
    public void area(){
        double a= length*width;
        System.out.println("The area of the rectangle is: "+ a);
    }
    public void perimeter(){
        double p= 2*(length+width);
        System.out.println("The perimeter of the rectangle is: "+p);
    }*/

    public double calculateArea(double length, double width){
        System.out.println("Area of the rectangle is "+ length*width);
        return length * width;
    }

    public void calculatePerimeter(){
        double p =2*(length+width);
        System.out.println("Perimeter of the rectangle is "+ p);
        //return p;
    }
}
