package ru.schepin.examples.parsingXML.jaxb.example1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbWriter {
    public void writePerson(Person person) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            String path = "C:\\Users\\Dmitry\\IdeaProjects\\ExampleFrom23092018\\src\\ru\\schepin\\examples\\parsingXML\\jaxb\\example1\\person.xml";
            marshaller.marshal(person, new File(path));


        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void writeListPersons(PhoneBook phoneBook) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(PhoneBook.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            String path = "C:\\Users\\Dmitry\\IdeaProjects\\ExampleFrom23092018\\src\\ru\\schepin\\examples\\parsingXML\\jaxb\\example1\\phoneBook.xml";
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(phoneBook, new File(path));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
