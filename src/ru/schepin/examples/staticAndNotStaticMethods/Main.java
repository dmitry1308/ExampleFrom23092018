package ru.schepin.examples.staticAndNotStaticMethods;

import ru.schepin.examples.workVariablesInMethods.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Dima");
        person.staticMethods();

        int a = 1;
        System.out.println(a);
    }
}
