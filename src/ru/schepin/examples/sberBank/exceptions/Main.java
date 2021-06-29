package ru.schepin.examples.sberBank.exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            throw new BusinessException("Исключение");
        } catch (BusinessException e) {
            //e.getMessage();
            e.printStackTrace();

        }
    }
}
