package ru.schepin.examples.escape;

public class Main {
    public static void main(String[] args) {
        System.out.println("It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.print("����\b");     // �������� ���������� �������
        System.out.println("��");

        System.out.print("������\n");
        System.out.print("��� ");

        System.out.println("\t������" );
        String name = "Intel Core 'i5'";
        String name1 = "Intel Core \'i5\'";
        System.out.println(name1);
        
    }
}
