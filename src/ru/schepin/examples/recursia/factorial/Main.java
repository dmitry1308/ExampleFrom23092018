package ru.schepin.examples.recursia.factorial;

public class Main {
    private static int factorial1(int n) {
        int result = 1;

        if (n == 0) {
            System.out.print(" = ");
            return result;
        }
        if (n == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(n);
        if (n != 2) {
            System.out.print(" * ");
        }

        result = n * factorial1(n - 1);
        return result;
    }


    public static void main(String[] args) {
        System.out.println(factorial1(4));
    }
}
