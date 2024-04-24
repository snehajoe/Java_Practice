package april20.inheritancedemo;

public class ScotiaBank extends BankOfCanada {
    int minimumDeposit;
    double fees;

    public ScotiaBank(String accountInfo, int accountNumber, double mortgageRate, int minimumDeposit, double fees) {
        super(accountInfo, accountNumber, mortgageRate);
        this.minimumDeposit = minimumDeposit;
        this.fees = fees;
    }

    public void printScotiaBankInfo(){
        super.printBankDetails();
        super.printMortgageRate();
        System.out.println("Minimum Deposit: "+ minimumDeposit);
        System.out.println("Account Fees: "+ fees);
    }
}
