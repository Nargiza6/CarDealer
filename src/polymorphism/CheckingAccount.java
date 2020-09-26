package polymorphism;

public class CheckingAccount extends AbstractBankAccount implements BankAccountService,Dummy{
    private  int balance;

    public CheckingAccount(int balance) {
        this.balance = balance;
    }

    public void showBalance(){
        System.out.println("Your balance is " + balance);
    }
    public void printDomain(){

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
