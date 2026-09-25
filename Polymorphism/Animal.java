package Polymorphism;
// Run-time polymorphism (method overriding)
public class Animal {
    public void animalSound() {
        System.out.println("Not Defined.");
    }
}

class Cat extends Animal { 
    @Override
    public void animalSound() {
        System.out.println("Meow, Meow.");
    }
}

class Dog extends Animal {
    @Override 
    public void animalSound() {
        System.out.println("Bow, Boww.");
    }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myCat = new Cat(); 
    Animal myDog = new Dog();
    myAnimal.animalSound();
    myCat.animalSound();
    myDog.animalSound();
  }
}