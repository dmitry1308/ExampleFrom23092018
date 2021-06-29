package ru.schepin.examples.maxPair;

public class Main {
    public static void main(String[] args) {
        Pair pair = new Pair();

        int[] list = {5, 12, 25, 23, 2,655};

        int firstPart;
        if (list.length % 2 != 0) {
            firstPart = list.length / 2;
        } else {
            firstPart = (list.length / 2) - 1;
        }

        pair.setNumberOne(list[0]);
        for (int i = 1; i <= firstPart; i++) {
            if (list[i] > pair.getNumberOne()) {
                pair.setNumberOne(list[i]);
            }
        }


        int secondPart = list[list.length - 1];
        pair.setNumberTwo(secondPart);
        for (int i = list.length - 1; i > (list.length - 1) / 2; i--) {
            if (list[i] > pair.getNumberTwo()) {
                pair.setNumberTwo(list[i]);
            }
        }

        System.out.println(pair);
    }
}
