package april16.oops;

public class Mobile {
    String brand;
    int capacity;

    public Mobile(String brand, int capacity){
        this.brand = brand;
        this.capacity = capacity;
        System.out.println(brand);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
