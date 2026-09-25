package AnonymousClass;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
            @Override
            public int multiply(int a, int b) {
                return a * b;
            }
        };
        System.out.println("Addition: " + c1.add(10, 20));
        System.out.println("Multiplication: " + c1.multiply(10, 20));
        Calculator c2 = new Calculator() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
            @Override
            public int multiply(int a, int b) {
                return a * b + 10;
            }
        };
        System.out.println("Addition: " + c2.add(10, 20));
        System.out.println("Special Multiplication: " + c2.multiply(10, 20));
    }
}
