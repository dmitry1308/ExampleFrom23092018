package ru.schepin.examples.parsingXML.jaxb.example1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"telephone","email","web"})
public class Person {
    private String name;
    private String email;
    private String telephone;
    private String web;


    public Person(String name, String email, String telephone, String web) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.web = web;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "имя")
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    @XmlElement
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }
    @XmlElement
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWeb() {
        return web;
    }
    @XmlElement
    public void setWeb(String web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", web='" + web + '\'' +
                '}';
    }
}
