package ru.schepin.examples.recursia.difficultFactorial;

public class Main {
    private static double calculate(int x, int n) {
        return power(x, n) / n;
    }
    private static double power(int x, int n) {
        if (n == 1) return x;
        return x * calculate(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(calculate(2, 3));


    }
}
