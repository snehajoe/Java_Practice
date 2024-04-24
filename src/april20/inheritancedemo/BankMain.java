package april20.inheritancedemo;

public class BankMain {
    public static void main(String[] args) {
        CIBC cibc= new CIBC("Savings",123, 4.5,100,15);
        cibc.printCIBCInfo();
        System.out.println(" ");

        ScotiaBank scotia= new ScotiaBank("Savings",456, 5.0,150,16.99);
        scotia.printScotiaBankInfo();
        System.out.println(" ");

        RBC rbc= new RBC("Chequing",987, 4.0,100,14.50);
        rbc.printRBCInfo();
    }
}
