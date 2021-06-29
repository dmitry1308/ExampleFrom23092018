package ru.schepin.examples.escape;

public class Main {
    public static void main(String[] args) {
        System.out.println("It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.print("Дима\b");     // Стирание последнего символа
        System.out.println("он");

        System.out.print("Привет\n");
        System.out.print("Оля ");

        System.out.println("\tПривет" );
        String name = "Intel Core 'i5'";
        String name1 = "Intel Core \'i5\'";
        System.out.println(name1);
        
    }
}
