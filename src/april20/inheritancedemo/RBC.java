package april20.inheritancedemo;

public class RBC extends BankOfCanada{
    int minimumDeposit;
    double fees;

    public RBC(String accountInfo, int accountNumber, double mortgageRate, int minimumDeposit, double fees) {
        super(accountInfo, accountNumber, mortgageRate);
        this.minimumDeposit = minimumDeposit;
        this.fees = fees;
    }

    public void printRBCInfo(){
        super.printBankDetails();
        super.printMortgageRate();
        System.out.println("Minimum Deposit: "+ minimumDeposit);
        System.out.println("Account Fees: "+ fees);
    }
}
