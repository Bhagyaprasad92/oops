package Abstraction.Interfaces;

public class NotificationDemo {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        notification.send("Your order has been shipped.");
        notification.cancel();
        notification = new SMSNotification();
        notification.send("Your OTP is 4521.");
        notification.cancel();
    }
}
