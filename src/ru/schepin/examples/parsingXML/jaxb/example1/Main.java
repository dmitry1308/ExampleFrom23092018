package ru.schepin.examples.parsingXML.jaxb.example1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person dima = new Person("Щепин Дмитрий", "bright1308@gmail.com", "89130137383", "-");
        Person yuri = new Person("Щепин Юрий", "L200@gmail.com", "89832242873", "-");
        Person vera = new Person("Щепина Вера", "vera@gmail.com", "89832242825", "-");
        JaxbWriter jaxbWriter = new JaxbWriter();
        jaxbWriter.writePerson(dima);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setPersons(Arrays.asList(dima, yuri, vera));
        jaxbWriter.writeListPersons(phoneBook);

        JaxbReader jaxbReader = new JaxbReader();
        String path = "C:\\Users\\Dmitry\\IdeaProjects\\ExampleFrom23092018\\src\\ru\\schepin\\examples\\parsingXML\\jaxb\\example1\\phoneBook.xml";
        PhoneBook phoneBook1 = jaxbReader.readPhoneBook(path);
        System.out.println(phoneBook1);
    }
}
