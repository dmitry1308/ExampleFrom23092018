package ru.schepin.examples.enums.examples1;

public class Main {
    public static void main(String[] args) {
        int number = Box.OPENED.getNumber();
        System.out.println(number);

        Box bomb = Box.BOMB;
        System.out.println(bomb);

    }
}
