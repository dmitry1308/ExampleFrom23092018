package ru.schepin.examples.equalsObjectsAndHashCode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PersonWithOutEguals dima = new PersonWithOutEguals("Dima", 32);
        PersonWithOutEguals dima5 = new PersonWithOutEguals("Dima", 32);
        PersonWithOutEguals victor = dima;
        System.out.println("dima.equals(dima5)  " + dima.equals(dima5));
        System.out.println("dima==dima5  " + (dima == dima5));

        System.out.println(dima == victor);

        PersonWithEguals dima1 = new PersonWithEguals("Dima", 32);
        PersonWithEguals dima2 = new PersonWithEguals("Dima", 32);
        System.out.println(dima1 == dima2);
        System.out.println(dima1.equals(dima2));

        PersonWithEguals dima3 = dima2;
        System.out.println(dima3.hashCode());
        System.out.println(dima2.hashCode());


        Integer a1 = 5;
        Integer a2 = 5;
        System.out.println( "Сравнение одинаковых Integer "+ (a1==a2));
        System.out.println( "Сравнение одинаковых Integer "+ a1.equals(a2));
        String s1 = "Hello";
        System.out.println(s1.hashCode());
        String s2 = "Hello";
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode()&(232600));


        System.out.println("Хэш код ля Димы : "+dima.hashCode());
        System.out.println("Хэш код ля Димы : "+dima.hashCode());
        System.out.println("--------------------------------------------------------------------");


        PersonWithEguals personWithEguals1 = new PersonWithEguals("Dima",32);
        System.out.println(personWithEguals1.hashCode());
        PersonWithEguals personWithEguals2 = new PersonWithEguals("Dima",32);
        System.out.println(personWithEguals2.hashCode());
        Map<PersonWithEguals,String> hashMap = new HashMap<>();
        hashMap.put(personWithEguals1, "1");
        hashMap.put(personWithEguals2, "2");

        HashMap<String, Integer> map = new HashMap<String, Integer>(3, (float) 0.75);
        map.put("abc",1);
        map.put("aaa",2);


        int d = 5;
        int c = 6;
        d = 8;
        System.out.println(d);

    }
}
