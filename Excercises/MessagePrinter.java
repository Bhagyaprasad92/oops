package excercises;

import java.util.Scanner;

public class MessagePrinter {
    void printMessage(String name) {
        System.out.println("Hello " + name + "!");
    }
    public static void main(String[] args) {
        MessagePrinter myObj = new MessagePrinter();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Name: ");
        String name = sc.nextLine();
        myObj.printMessage(name);
        sc.close();
    }
}