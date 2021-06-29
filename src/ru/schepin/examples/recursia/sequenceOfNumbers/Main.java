package ru.schepin.examples.recursia.sequenceOfNumbers;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int begin = 1;
        int finish = 20;

        recurse(begin, finish);
        System.out.println();
        System.out.println(list.toString());

       

    }

    private static void recurse(int begin, int finish) {
        list.add(begin);
        System.out.print(begin + " ");
        if (begin < finish) {
            recurse(begin + 1, finish);
        }
    }
}
