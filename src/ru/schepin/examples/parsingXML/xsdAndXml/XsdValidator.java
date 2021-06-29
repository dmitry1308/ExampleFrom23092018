package ru.schepin.examples.parsingXML.xsdAndXml;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XsdValidator {
    public static void main(String[] args) {
        String xsd = "C:\\Users\\Dmitry\\IdeaProjects\\ExampleFrom23092018\\src\\ru\\schepin\\examples\\parsingXML\\xsdAndXml\\message.xsd";
        String xml = "C:\\Users\\Dmitry\\IdeaProjects\\ExampleFrom23092018\\src\\ru\\schepin\\examples\\parsingXML\\xsdAndXml\\message.xml";
        boolean answer = validateXMLSchema(xsd, xml);
        System.out.println("Result:" + answer);
    }

    public static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            // Получить фабрику для схемы
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            // Загрузить схему   из XSD
            Schema schema = factory.newSchema(new File(xsdPath));
            // Создать валидатор (проверялбщик)
            Validator validator = schema.newValidator();
            // Запусить проверку - если будет исключение, значит есть ошибки.
            // Если нет - все заполнено правильно
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException | SAXException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
        return true;
    }

}
