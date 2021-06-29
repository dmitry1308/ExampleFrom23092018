package ru.schepin.examples.equalsObjectsAndHashCode;

import java.util.Objects;

public class PersonWithEguals{
    private String name;
    private int age;



    public PersonWithEguals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonWithEguals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonWithEguals that = (PersonWithEguals) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
