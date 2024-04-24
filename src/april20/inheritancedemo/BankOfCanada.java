package april20.inheritancedemo;

public class BankOfCanada extends Bank{
    double mortgageRate;

    public BankOfCanada(String accountInfo, int accountNumber, double mortgageRate) {
        super(accountInfo, accountNumber);
        this.mortgageRate = mortgageRate;
    }

    public void printMortgageRate() {
        System.out.println("Mortgage Rate: "+ mortgageRate);
    }
}
