package ru.schepin.examples.workVariablesInMethods;

import java.util.Objects;

public class Person {
    private String name;
    private Long number;

    public Person(Long number) {
        this.number = number;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ru.schepin.examples.recursia.workVariablesInMethods.Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void  staticMethods() {
        System.out.println("Вызван стат метод!");
    }



    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    public Long getNumber() {
        return number;
    }
}
