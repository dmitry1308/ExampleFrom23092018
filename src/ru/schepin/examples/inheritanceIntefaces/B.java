package ru.schepin.examples.inheritanceIntefaces;

public class B extends A {
    int a = 2;
    int b ;

    public B(int a, int b) {
        super(a);
        int a1 = super.a;
        this.b = b;
    }

    public void f() {
        System.out.println("������  ����� f � ������ B");
    }

    public static void staticFunction() {
        System.out.println("������ ������ ����� � ������ B");
    }
}
