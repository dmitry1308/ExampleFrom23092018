package ru.schepin.examples.findAreaWithOne;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 =
                {{0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0},
                        {1, 1, 0, 0, 0},
                        {0, 0, 1, 1, 1},
                        {0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0}};

        int[][] matrix2 =
                {{0, 1, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 1, 0},
                        {0, 1, 0, 0}};

        int[][] matrix3 =
                {{0, 0, 0, 0},
                        {0, 1, 0, 0},
                        {0, 0, 1, 1},
                        {0, 1, 0, 0}};

        int[][] matrix4 =
                {{0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 1, 0, 0}};

        int[][] matrix5 =
                {{0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0}};


        List<int[][]> matrixs = Arrays.asList(matrix1, matrix2, matrix3, matrix4, matrix5);

        Handler handler = new Handler();
        for (int i = 0; i < matrixs.size(); i++) {

            System.out.println("Матрица " + (i + 1) + ":");
            int[][] matrix = matrixs.get(i);
            print(matrix);

            System.out.println("Результат:");
            int[][] areaWithOne = handler.findAreaWithOne(matrix);
            if (areaWithOne.length != 0) {
                print(areaWithOne);
            } else {
                System.out.println("В матрице нет единиц!");
            }
            System.out.println("------------------------------------------");
        }
    }

    private static void print(int[][] areaWithOne) {
        for (int[] anAreaWithOne : areaWithOne) {
            for (int anAnAreaWithOne : anAreaWithOne) {
                System.out.print(anAnAreaWithOne + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
