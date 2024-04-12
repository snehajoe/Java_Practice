package april6;

public class MainMobile {
    public static void main(String[] args) {

        Mobile m = new Mobile();
        //calling methods
        m.texting();
        m.makeOutGoingCalls("Blue");
        m.receiveIncomingCalls();
    }
}
