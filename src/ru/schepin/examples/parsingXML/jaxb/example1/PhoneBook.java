package ru.schepin.examples.parsingXML.jaxb.example1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class PhoneBook {
    private List<Person> persons;

    public PhoneBook(List<Person> persons) {
        this.persons = persons;
    }

    public PhoneBook() {
    }

    public List<Person> getPersons() {
        return persons;
    }
    @XmlElement
    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "persons=" + persons +
                '}';
    }
}
