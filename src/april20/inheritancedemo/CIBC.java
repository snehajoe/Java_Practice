package april20.inheritancedemo;

public class CIBC extends BankOfCanada {
    int minimumDeposit;
    double fees;

    public CIBC(String accountInfo, int accountNumber, double mortgageRate, int minimumDeposit, double fees) {
        super(accountInfo, accountNumber, mortgageRate);
        this.minimumDeposit = minimumDeposit;
        this.fees = fees;
    }

    public void printCIBCInfo(){
        super.printBankDetails();
        super.printMortgageRate();
        System.out.println("Minimum Deposit: "+ minimumDeposit);
        System.out.println("Account Fees: "+ fees);
    }
}
