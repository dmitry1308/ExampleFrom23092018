package ru.schepin.examples.sqrt2;

public class Main {
    private static final int rootOfNumber = 123;
    private static String rootFromNumber;

    public static void main(String[] args) {
        double[] interval = findInterval(rootOfNumber);
        //   System.out.println("interval: " + Arrays.toString(interval));

        findSqrt(interval[0], interval[1]);
        System.out.println("\n" + "Корень из числа " + rootOfNumber + " равен " + rootFromNumber);
    }

    private static double[] findInterval(int rootOfNumber) {
        double[] interval = new double[2];
        int amount = initAmount(rootOfNumber);
        double resultRootFromNumber = rootOfNumber / amount;
        double numberNearOfRootOfNumber = resultRootFromNumber * resultRootFromNumber;
        if (numberNearOfRootOfNumber > rootOfNumber) {
            interval[0] = resultRootFromNumber / 2;
            interval[1] = resultRootFromNumber;
        }
        if (numberNearOfRootOfNumber < rootOfNumber) {
            interval[0] = resultRootFromNumber;
            interval[1] = rootOfNumber;
        }

        return interval;
    }

    private static int initAmount(int rootOfNumber) {
        int amount = String.valueOf(rootOfNumber).length() - 1;
        int result = 2;
        for (int i = 0; i < amount; i++) {
            result = result * 10;
        }
        return result;
    }


    private static void findSqrt(double start, double end) {
        double avg = (start + end) / 2;
        double numberNearRoot = avg * avg;


        double eps = Math.abs(rootOfNumber - numberNearRoot);

        if (numberNearRoot > rootOfNumber && eps > 0.0005) {
            findSqrt(start, avg);
        } else if (numberNearRoot < rootOfNumber && eps > 0.05) {
            findSqrt(avg, end);
        } else {
            rootFromNumber = String.format("%.3f", avg);
            // double i = (double)((int) (avg * 1000)) / 1000;
        }
//        System.out.println("avg: " + avg + " из интервала (" + start + " и " + end + ")");
//        System.out.println("avg * avg = " + numberNearRoot + " = " + rootOfNumber);
    }
}
