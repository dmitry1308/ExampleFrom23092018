package ru.schepin.examples.enums.planets;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double gravity = Planet.MERCURY.getGravity();
        System.out.println(gravity);

        double mass = Planet.Earth.getMass();
        System.out.println(mass);
        int x = -1;
        if (x % 2 == 1) {
            System.out.println("cdcw");
        }
        System.out.println(5 * 4 % 3);

        int[] ar = {5, 2, 1, 10, -6, -3};
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    int temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(ar));
    }

}
