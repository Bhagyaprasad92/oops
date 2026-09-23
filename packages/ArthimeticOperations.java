package packages;

public class ArthimeticOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        int res = 0;
        try {
            res = a / b;
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by zero.");
        }
        return res;
    }

    public int mod(int a, int b) {
        if (a > 0 && b > 0) {
            return a % b;
        }
        System.err.println("Cannot divide by zero.");
        return -1;
    }
}
