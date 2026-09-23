package excercises;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lName = sc.nextLine();
        Person p1 = new Person(fName, lName);
        System.out.println("Your full name is: " + p1.toString());
        sc.close();
    }
}
