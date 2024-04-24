package april20;

public class Car extends Vehicle {
    double price;

    public Car(String color, String make, String model, int speed, int year, double price) {
        super(color, make, model, speed, year);
        this.price = price;
    }

    public void printCar(){
        System.out.println(super.year);
        System.out.println(super.color);
    }
}

//this keyword      super keyword
//>cureent class    > parent class