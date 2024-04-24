package april23.abstraction;

public abstract class BankOfCanada {
    public abstract double rateOfInterest();
}

class ScotiaBank extends BankOfCanada{
    @Override
    public double rateOfInterest() {
            return 10.0;
    }
}

class RBC extends BankOfCanada{
    @Override
    public double rateOfInterest() {
        return 6.5;
    }
}

class BankMain{
    public static void main(String[] args) {
        BankOfCanada scotia = new ScotiaBank();
        System.out.println("ROI in Scotiabank: "+ scotia.rateOfInterest());

        BankOfCanada rbc = new RBC();
        System.out.println("ROI in RBC: "+ rbc.rateOfInterest());
    }
}