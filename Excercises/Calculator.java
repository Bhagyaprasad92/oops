package Excercises;

import java.util.Scanner;

public class Calculator {
    int calculateSum(int a, int b) {
        return a + b;
    }
    int calculateDifference(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Calculator myObj = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = myObj.calculateSum(a, b);
        System.out.println("Sum of " + a + " and " + b + " equals to: " + sum);
        int diff = myObj.calculateDifference(a, b);
        System.out.println("Difference of " + a + " and " + b + " equals to: " + diff);
        sc.close();
    }
}
