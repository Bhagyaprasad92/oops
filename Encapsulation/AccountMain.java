public class AccountMain {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("23MH1A05F7", 1200.21);
        System.out.println("Your account Number is: " + account1.getAccountNumber());
        System.out.println("Your Initial account Balance is: " + account1.getBalance());
        account1.deposit(1000.54);
        System.out.println("Your account Balance after deposit is: " + account1.getBalance());
        account1.withdraw(500.31);
        System.out.println("Your account Balance after withdraw is: " + account1.getBalance());
        account1.withdraw(1700);
        System.out.printf("%.2f", account1.getBalance());
    }
}
