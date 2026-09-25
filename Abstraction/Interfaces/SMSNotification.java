package Abstraction.Interfaces;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Successful!, " + message + " was sent through SMS.");
    }

    @Override
    public void cancel() {
        System.out.println("SMS notification is cancelled.");
    }
}
