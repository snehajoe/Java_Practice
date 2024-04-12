package april6;

public class Animal {

    //instance variables
    String color;
    double height;

    public Animal(){
        color = "Black";
        height = 15.0;
    }

    public void walk(String color, double height){          //local variables
        System.out.println("The "+ color+" animal of height "+ height+" can walk");
    }
    public void eat(){
        System.out.println("The "+ color+ " animal is eating food");
    }
    public void makeSound(){
        System.out.println("The animal of height "+ height+ " can make sounds");
    }

}
