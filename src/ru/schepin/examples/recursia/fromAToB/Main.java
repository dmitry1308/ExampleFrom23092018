
package ru.schepin.examples.recursia.fromAToB;

public class Main {
    private static String calculateToRecursia(int a, int b) {
        if (a > b) {
            return a + " " + calculateToRecursia(a - 1, b);
        }

        if (b == a) {
            return String.valueOf(a);
        }

        return a + " " + calculateToRecursia(a + 1, b);
    }

    private static String calculateToFor(int a, int b) {
        StringBuilder builder = new StringBuilder("result = ");
        int result = 1;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                result = result * i;
                builder.append(i + " * ");

            }
            builder.delete(builder.length() - 3, builder.length() - 1);
            builder.append(" = " + result);
            return builder.toString();
        }
        if (a > b) {
            for (int i = a; i >= b; i--) {
                result = result * i;
                builder.append(i + " * ");

            }
            builder.delete(builder.length() - 3, builder.length() - 1);
            builder.append(" = " + result);
            return builder.toString();
        }

        return String.valueOf(a);
    }


    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        String result = calculateToRecursia(a, b);
        System.out.println(result);

        String result1 = calculateToFor(a, b);
        System.out.println(result1);
    }
}

