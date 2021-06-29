package ru.schepin.examples.sberBank.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static class A {

    }


    public static void m1(List<? super Number> list) {
        Object n =list.get(0);
        System.out.println(n);
    }

    public static void main(String[] args) {
        String[] p = {"1", "2", "3"};
        ArrayList<?> strings = new ArrayList<>(Arrays.asList(p));
        System.out.println(strings.toString());

        List<Object> integers = Arrays.asList(1, 2, 3);
        m1(integers);



    }
}
