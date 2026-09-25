package Polymorphism;
// Compiletime polymorphism (method overloading)
public class MathUtil {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
