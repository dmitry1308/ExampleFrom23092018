package ru.schepin.examples.sberBank.multitrading;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.print("one. ");

        myThread.start();
        System.out.print("two. ");
        System.out.print("Thread ");
    }
}
