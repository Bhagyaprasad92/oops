package Inheritance;

public class Vehicle {
    protected String brand;
    public Vehicle() {
        brand = "Undefined.";
    }
    protected void honk() {
        System.out.println("Meow, Meow!");
    }
}

class Car extends Vehicle {
    public static void main(String[] args) {
        Vehicle c1 = new Car();
        c1.honk();
        System.out.println(c1.brand);
        c1.brand = "Honda";
        System.out.println(c1.brand);
    }
}