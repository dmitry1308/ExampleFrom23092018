package ru.schepin.examples.sorts;

import java.util.Arrays;

public class SortBySelection {
    public static void main(String[] args) {
        int[] ar = {-2, -3, 0, -10, -26, -1};
        sortAr(ar);
        System.out.println(Arrays.toString(ar));

    }

    private static int[] sortAr(int[] ar) {
        int min = ar[0];
        int indexOfMin = 0;

        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length - 1; j++) {
                if (ar[j] > min) {
                    min = ar[j];
                    indexOfMin = j;
                }

                if (indexOfMin != j) {
                    int temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }
        return ar;
    }
}
