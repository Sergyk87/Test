package seminar_1;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }

    public double calculateDiscount(int a, int b) {
        if (b < 0 || b > 100) {
            throw new ArithmeticException("Процент скидки должен быть от 0 до 100");
        }
        return (double) a - a * b / 100;
    }
}
