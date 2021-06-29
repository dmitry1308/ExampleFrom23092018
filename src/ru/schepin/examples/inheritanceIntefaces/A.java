package ru.schepin.examples.inheritanceIntefaces;

public class A  {
    int a = 1;

    public A(int a) {
        this.a = a;
    }

    public void f() {
        System.out.println("Вызван  метод f в классе A");
    }

    public static void staticFunction() {
        System.out.println("Вызван статис метод в классе A");
    }
}
