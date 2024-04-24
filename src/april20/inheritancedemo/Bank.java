package april20.inheritancedemo;

public class Bank {
    String accountInfo;
    int accountNumber;

    public Bank(String accountInfo, int accountNumber) {
        this.accountInfo = accountInfo;
        this.accountNumber = accountNumber;
    }

    public void printBankDetails(){
        System.out.println("Account Info: "+ accountInfo);
        System.out.println("Account Number: "+ accountNumber);
    }
}
