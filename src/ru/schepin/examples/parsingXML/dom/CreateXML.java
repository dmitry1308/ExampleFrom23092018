package ru.schepin.examples.parsingXML.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateXML {
    public static void main(String[] args) throws IOException, SAXException {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            String path = "C:\\Users\\Dmitry\\IdeaProjects\\ExampleFrom23092018\\src\\ru\\schepin\\examples\\parsingXML\\dom\\example.xml";
            Document document = documentBuilder.parse(path);
            Document documentWithOneBook = addBook(document);
            write(documentWithOneBook);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    private static void write(Document documentWithOneBook) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource domSource = new DOMSource(documentWithOneBook);

            String path = "C:\\Users\\Dmitry\\IdeaProjects\\ExampleFrom23092018\\src\\ru\\schepin\\examples\\parsingXML\\exampleChange.xml";
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            StreamResult streamResult = new StreamResult(fileOutputStream);

            transformer.transform(domSource, streamResult);

        } catch (TransformerConfigurationException e) {
        } catch (FileNotFoundException | TransformerException e) {
            e.printStackTrace();
        }
    }

    private static Document addBook(Document document) {
        Element root = document.getDocumentElement();

        Element book = document.createElement("Book");

        Element title = document.createElement("Title");
        title.setTextContent("Моя книга");

        Element author = document.createElement("Author");
        author.setTextContent("Щепин");

        Element date = document.createElement("Date");
        date.setTextContent("2015");

        Element isbn = document.createElement("ISBN");
        isbn.setTextContent("0-06-999999-9");

        Element publisher = document.createElement("Publisher");
        publisher.setTextContent("Java-Course publisher");

        Element cost = document.createElement("Cost");
        cost.setTextContent("499");

        cost.setAttribute("currency", "RUB");

        book.appendChild(title);
        book.appendChild(author);
        book.appendChild(date);
        book.appendChild(isbn);
        book.appendChild(publisher);
        book.appendChild(cost);

        root.appendChild(book);
        return document;
    }
}
