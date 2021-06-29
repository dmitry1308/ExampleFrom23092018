package ru.schepin.examples.sberBank.serialize;

import java.io.Serializable;

public class A implements Serializable {
    transient int a = 7;
    static int b = 9;
}
