package ru.schepin.examples.parsingXML.stax;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StaxWriteExample {
    public static void main(String[] args) {
        try {
            XMLOutputFactory output = XMLOutputFactory.newInstance();
            final String fileName = "C:\\Users\\Dmitry\\IdeaProjects\\ExampleFrom23092018\\src\\ru\\schepin\\examples\\parsingXML\\stax\\result.xml";
            XMLStreamWriter writer = output.createXMLStreamWriter(new FileWriter(fileName));

            // ��������� XML-�������� � ����� �������� ������� BookCatalogue
            writer.writeStartDocument("1.0");
            writer.writeStartElement("BookCatalogue");
            // ������ ���� ��� ����
            for (int i = 0; i < 5; i++) {
                // ���������� Book
                writer.writeStartElement("Book");

                // ��������� ��� ���� ��� �����
                // Title
                writer.writeStartElement("Title");
                writer.writeCharacters("Book #" + i);
                writer.writeEndElement();
                // Author
                writer.writeStartElement("Author");
                writer.writeCharacters("Author #" + i);
                writer.writeEndElement();
                // Date
                writer.writeStartElement("Date");
                writer.writeCharacters(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                writer.writeEndElement();
                // ISBN
                writer.writeStartElement("ISBN");
                writer.writeCharacters("ISBN #" + i);
                writer.writeEndElement();
                // Publisher
                writer.writeStartElement("Publisher");
                writer.writeCharacters("Publisher #" + i);
                writer.writeEndElement();
                // Cost
                writer.writeStartElement("Cost");
                writer.writeAttribute("currency", "USD");
                writer.writeCharacters("" + (i + 10));
                writer.writeEndElement();

                // ��������� ��� Book
                writer.writeEndElement();
            }
            // ��������� �������� �������
            writer.writeEndElement();
            // ��������� XML-��������
            writer.writeEndDocument();
            writer.flush();
        } catch (XMLStreamException | IOException ex) {
            ex.printStackTrace();
        }
    }


}
