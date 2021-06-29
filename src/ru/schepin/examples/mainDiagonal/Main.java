package ru.schepin.examples.mainDiagonal;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{3, 589, 8}, {15, 6, 5}, {1, -12, 8}};
        int minNumber = findMinNumber(arr);
        System.out.println(minNumber);

        

    }

    private static int findMinNumber(int[][] arr) {
        int min = arr[1][0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j < count) {
                    int number = arr[i][j];
                    if (number < min) {
                        min = number;
                    }
                }
            }
            count++;
        }
        return min;
    }
}
