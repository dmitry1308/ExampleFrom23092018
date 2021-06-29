package ru.schepin.examples.sberBank.exceptions;

public class BusinessException extends Exception {

    public BusinessException(String message) {
        super(message);
        System.out.println(message);
    }
}
