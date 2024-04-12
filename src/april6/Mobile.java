package april6;

public class Mobile {
    double weight;
    String brand;
    double price;


    public void makeOutGoingCalls(String color) {
        System.out.println("Making outgoing call from " +color+ " phone to a friend");
    }

    public void receiveIncomingCalls(){
        System.out.println("Receiving a call");
    }

    public void texting(){
        System.out.println("Sending a Text message");
    }
}
