package polymorphism;

public class BankDriver {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(100);
        checkingAccount.showBalance();

        System.out.println(BankAccountService.domain);
        checkingAccount.printDomain();

        System.out.println(BankAccountService.isAccountOnPossitive(checkingAccount));
    }
}
