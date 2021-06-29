package ru.schepin.examples.jenerics;

import java.util.Arrays;
import java.util.List;

public class ArraysAndJenerics {
    public static void main(String[] args) {
        String[] strings = {"foo", "bar"};
        Object[] objects = strings;

        List<String> strings1 = Arrays.asList("foo", "bar");
        // error: incompatible types
        List<?> objects1 = strings1;
        System.out.println(objects1);
    }
}
