package ru.schepin.examples.equalsObjectsAndHashCode;

public class PersonWithOutEguals {
    private String name;
    private int age;


    public PersonWithOutEguals(String name) {
        this.name = name;
    }

    public PersonWithOutEguals(String name, int age) {
        this.name = name;
        this.age = age;
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
}
