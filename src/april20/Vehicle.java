package april20;

public class Vehicle {
    String color;
    String make;
    String model;
    int speed;
    int year;

    public Vehicle(String color, String make, String model, int speed, int year) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.speed = speed;
        this.year = year;
    }

    public void printCarDetails(){
        System.out.println("Color: "+ color);
        System.out.println("Make: "+ make);
        System.out.println("Model: "+ model);
        System.out.println("Speed: "+ speed);
        System.out.println("Year: "+ year);
    }

    /*public Car getCraObject(){
        return new Car("Blue", "Honda", "Civic", 200, 2024, 2346.99);
    }*/
    //to create a car object in other classes other than in main class
}
