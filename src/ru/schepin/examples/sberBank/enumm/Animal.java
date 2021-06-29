package ru.schepin.examples.sberBank.enumm;

public enum Animal {
    LION,TIGER(20),BEAR;
    int weight;

     Animal(int w) {
        weight = w;
    }

    Animal() {
    }
}
