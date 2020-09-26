package polymorphism;

public interface BankAccountService {

    public static final String domain  = "Finance";

    public abstract void showBalance(); //public abstract can be removed

    default void printDomain(){
        System.out.println(domain);
    }
    static boolean isAccountOnPossitive(CheckingAccount checkingAccount){
     return checkingAccount.getBalance() > 0;
    }
}
