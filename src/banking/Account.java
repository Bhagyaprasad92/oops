package banking;

public class Account {
   private String accountHolder;
   private double balance;

   public Account(String accountHolder, double balance) {
      this.accountHolder = accountHolder;
      this.balance = balance;
   }

   public void displayDetails() {
      System.out.println("Account Holder name is: " + this.accountHolder);
      System.out.println("Account Holder " + this.accountHolder + " balance is: " + this.balance);
   }
}
