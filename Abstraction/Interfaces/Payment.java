package Abstraction.Interfaces;

public interface Payment {
    void pay(double amount);
    void refund(double amount);
}

/**
 * UPIPayment
 */
class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Successful!, " + amount + " was paid using UPI.");
    }
    @Override
    public void refund(double amount) {
        System.out.println("Successful!, " + amount + " was refunded through UPI.");
    }
}

class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Successful!, " + amount + " was paid using a Card.");
    }
    @Override
    public void refund(double amount) {
        System.out.println("Successful!, " + amount + " was refunded to the Card.");
    }
}

class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new UPIPayment();
        p1.pay(1500.24);
        p1.refund(500.13);
        Payment p2 = new CardPayment();
        p2.pay(2500.31);
        p2.refund(1000.11);
    }
}