package ru.schepin.examples.argumentsInMethods;

public class Main {
    public static void main(String[] args) {
        //Передача примитивного значения в функцию
        int number = 5;
        System.out.println("Исходное значение " + number);
        change(number);
        System.out.println("Исходное значение после передачи методу " + number);
        System.out.println();

        //Передача ссылочного значения в функцию
        Integer number1 = 6;
        System.out.println("Исходное значение " + number1);
        change(number1);
        System.out.println("Исходное значение после передачи методу " + number1);
        System.out.println();


        Person peter = new Person();
        System.out.println("Исходное значение: " + peter);
        change(peter);
        System.out.println("Результат: " + peter);
    }

    private static void change(Person peter) {
        peter.setName("Karl");
    }

    private static void change(int i) {
        i = 6;
    }

    private static void change(Integer i) {
        i = 7;
    }


    static class Person {
        private String name;

        public Person() {
            name = "Peter";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
