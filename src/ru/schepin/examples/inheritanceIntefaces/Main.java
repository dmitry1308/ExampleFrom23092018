package ru.schepin.examples.inheritanceIntefaces;

import ru.schepin.examples.workVariablesInMethods.Person;

import static java.util.Objects.hash;

public class Main {
    public static void main(String[] args) {
        A a=new B(2,3);
        a.f();

        a.staticFunction();
        int a1 = a.a;
        System.out.println(a1);


        I i = new I() {
            @Override
            public String createString(String s) {
                return "Dima " +s;
            }
        };

        System.out.println(i.createString("Schepin"));

        Main main = new Main();

        int number = 5;
        int hash = hash(number);
        int hash1 = hash(number);

        System.out.println(hash);
        System.out.println(hash1);

        Person person = new Person("dfvf");
        int i1 = person.hashCode();
        System.out.println(i1);

        Person i2 = new Person("dfvf");
        System.out.println(i2.hashCode());

        
        Person person1 = new Person((long) 545444444);

    }
}
