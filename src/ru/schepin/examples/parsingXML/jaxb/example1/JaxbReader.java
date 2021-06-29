package ru.schepin.examples.parsingXML.jaxb.example1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbReader {
    public PhoneBook readPhoneBook(String path) {
        PhoneBook phoneBook = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(PhoneBook.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            phoneBook = (PhoneBook) unmarshaller.unmarshal(new File(path));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return phoneBook;
    }
}
