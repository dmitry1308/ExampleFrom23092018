package ru.schepin.examples.annotation;

@CreatedBy(author = "Dima")
public class Main {
    @CreatedBy(author = "Dima")
    public static void main(String[] args) {
        Class<Main> mainClass = Main.class;
        CreatedBy annotations = mainClass.getAnnotation(CreatedBy.class);
        System.out.println(annotations.getClass());


    }
}
