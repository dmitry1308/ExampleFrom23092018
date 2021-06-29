package ru.schepin.examples.sber;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Example {
    class Shape{

    }

    public static void main(String[] args) {
        Predicate<Object> p = Predicate.isEqual(2).and(Predicate.isEqual(null));
        System.out.println(p.test(2));
        System.out.println();

        Integer a = 5;
        List<Integer> list = new ArrayList<>();
        list.add(a);
        Example example=new Example();
        example.m1(list);

    }

    public void m1(List<? extends Number> list){
        Number n = list.get(0);
        System.out.println(n);

    }

    public List<? extends Shape> m6(List<? extends Shape> list){
        List<Shape> list1 = new ArrayList<>();
        list1.add(new Shape());
        return list;
    }
}
