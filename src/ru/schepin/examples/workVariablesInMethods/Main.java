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
        System.out.println("В этом примере мы видим что передается копия переменной s и в " +
                "самом методе это не влияет на саму переменную. Я создал по сути новый объект" +
                "s = 12345 и копия ссылки переориентировалась на новый объект 12345");
        String s = "123";
        get(s);
        System.out.println(s);

        System.out.println("В этом примере передаче идет поссылке. " +
                "Т.е. создается копия ссылки в методе, " +
                "но эты ссылка ссылается на тот же объект и " +
                "работая с ней мы меняем сам объект");
        Person victor = new Person("Victor");
        System.out.println(victor);
        change(victor);
        System.out.println(victor);

        System.out.println("Тут передается методу копия ссылки, " +
                "но в самом методе мы перенаправляем эту ссылку на новый объект и" +
                " все изменения происходят с новым объектом, а старый остается без изменений");
        Person karl = new Person("Karl");
        System.out.println(karl);
        change1(karl);
        System.out.println(karl);

        String name = victor.getClass().getSimpleName();
        System.out.println(name);


        
    }
}
