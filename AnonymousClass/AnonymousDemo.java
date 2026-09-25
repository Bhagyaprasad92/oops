package AnonymousClass;

public class AnonymousDemo {
    public static void main(String[] args) {
        Greeting greet = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello Developer.");
            }
        };
        greet.sayHello();
    }
}
