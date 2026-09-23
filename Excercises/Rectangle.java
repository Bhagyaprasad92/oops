package Excercises;

import java.util.Scanner;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(int length) {
        this.length = length;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0)
            this.length = length;
        else
            System.err.println("Length must be a positive integer.");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0)
            this.width = width;
        else
            System.err.println("Width must be a positive integer.");
    }

    public int area() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
       System.out.println("Default Area: " + rectangle.area());

       rectangle.setLength(5);
       rectangle.setWidth(4);
       System.out.println("Updated Area: " + rectangle.area());

       Rectangle customRectangle = new Rectangle(7, 3);
       System.out.println("Custom Area: " + customRectangle.area());
    }
}
