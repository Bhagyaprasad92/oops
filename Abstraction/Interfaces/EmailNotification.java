package Abstraction.Interfaces;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Successful!, " + message + " was sent through Email.");
    }
    @Override
    public void cancel() {
        System.out.println("Email notification is cancelled.");
    }
}
