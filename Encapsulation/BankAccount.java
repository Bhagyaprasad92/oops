
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) balance += amount;
        else System.err.println("Amount must be greater than 0.");
    }

    public void withdraw(double amount) {
        if(amount > 0 && balance > amount) balance -= amount;
        else System.err.println("Amount must be greater than 0 and not exceeding balance.");
    }
}