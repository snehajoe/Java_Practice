package april6;

public class Car {
    String color;
    String brand;
    double price;

    public Car(){
        color ="blue";
    }

    public void displayCarInfo(){
        System.out.println("Color: "+ color);
        System.out.println("Brand: "+ brand);
        System.out.println("Price: "+ price);

        double tax = 13.00;
        double total = tax*price;
        System.out.println("Total tax "+ total);
    }
}
