package april16.oops.inheritancedemo;

public class CarMain {
    public static void main(String[] args) {
        /*Vehicle vehicle= new Vehicle();
        vehicle.displayInfo();*/        //no need to use 2 objects coz of inheritance

        Car car = new Car();
        car.displayInfo();
        car.displayCarInfo();
    }
}
