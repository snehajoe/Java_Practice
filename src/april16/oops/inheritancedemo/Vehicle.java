package april16.oops.inheritancedemo;

public class Vehicle {
    String brand = "Honda";
    String model = "Accord";
    int year = 2019;
    private String type = "Sedan"; //if made pvt cannot be accessed in inheritance

    /*public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }*/

    public void displayInfo(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
    }
}
