package ru.schepin.examples.inheritanceIntefaces;

public class A  {
    int a = 1;

    public A(int a) {
        this.a = a;
    }

    public void f() {
        System.out.println("������  ����� f � ������ A");
    }

    public static void staticFunction() {
        System.out.println("������ ������ ����� � ������ A");
    }
}
