package ru.schepin.examples.sberBank.lambda;

public class UseDeveloper {
    public static void main(String[] args) {
        String petrov = "Petrov";
        Developer dev = () -> System.out.println(petrov +" ок");
        dev.writeCode();
    }
}
