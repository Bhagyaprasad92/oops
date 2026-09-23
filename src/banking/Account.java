package banking;

public class Account {
   private String accountHolder;
   private double balance;

   public Account(String var1, double var2) {
      this.accountHolder = var1;
      this.balance = var2;
   }

   public void displayDetails() {
      System.out.println("Account Holder name is: " + this.accountHolder);
      System.out.println("Account Holder " + this.accountHolder + " balance is: " + this.balance);
   }
}
