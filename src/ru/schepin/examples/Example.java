package ru.schepin.examples;

import ru.schepin.examples.workVariablesInMethods.Person;

public class Example {
    public static void main(String[] args) {
        Person p1=null;
        Person p2 = null;

        p1 = p2;
       // p2 = p1;




        int a = 0;
        int b = a;

        a = 1;
        System.out.println("b = " +b);

        String s = "a".concat(", b");
        System.out.println(s);



    }
}
