package ru.schepin.examples.workVariablesInMethods;

public class Main {
    static String get(String s) {
        s = "12345";
        return s;
    }

    static void change(Person victor) {
        victor.setName("Dima");
    }

    static void change1(Person victor) {
        victor = new Person("Petr");
    }


    public static void main(String[] args) {
        System.out.println("� ���� ������� �� ����� ��� ���������� ����� ���������� s � � " +
                "����� ������ ��� �� ������ �� ���� ����������. � ������ �� ���� ����� ������" +
                "s = 12345 � ����� ������ ������������������� �� ����� ������ 12345");
        String s = "123";
        get(s);
        System.out.println(s);

        System.out.println("� ���� ������� �������� ���� ��������. " +
                "�.�. ��������� ����� ������ � ������, " +
                "�� ��� ������ ��������� �� ��� �� ������ � " +
                "������� � ��� �� ������ ��� ������");
        Person victor = new Person("Victor");
        System.out.println(victor);
        change(victor);
        System.out.println(victor);

        System.out.println("��� ���������� ������ ����� ������, " +
                "�� � ����� ������ �� �������������� ��� ������ �� ����� ������ �" +
                " ��� ��������� ���������� � ����� ��������, � ������ �������� ��� ���������");
        Person karl = new Person("Karl");
        System.out.println(karl);
        change1(karl);
        System.out.println(karl);

        String name = victor.getClass().getSimpleName();
        System.out.println(name);


        
    }
}
