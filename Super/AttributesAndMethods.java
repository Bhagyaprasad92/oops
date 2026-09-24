package Super;

public class AttributesAndMethods {
    public void animalSound() {
        System.out.println("Most of the Animals makes a Sound.");
    }
}

class Dog extends AttributesAndMethods {
    public void animalSound() {
        super.animalSound();
        System.out.println("Dog barks: Bow, Bow.");
    }
}

class Cat extends AttributesAndMethods {
    public void animalSound() {
        super.animalSound();
        System.out.println("Cat says: Meow, Meow.");
    }
}

class AttributesAndMethodsMain {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalSound();
        Cat myCat = new Cat();
        myCat.animalSound();
    }
}
