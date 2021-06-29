package ru.schepin.examples.parsingXML.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class ReadXML {
    public static void main(String[] args) throws IOException, SAXException {
//        ”нифицированна€ структура, котора€ называетс€ Document Object Model (DOM).
//                DOM представл€ет собой набор интерфейсов (и их реализаций),которые €вл€ютс€

//        специализированными объектами дл€ хранени€ УузловФ(node) XML - документа.
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            String path = "C:\\Users\\Dmitry\\IdeaProjects\\ExampleFrom23092018\\src\\ru\\schepin\\examples\\parsingXML\\dom\\example.xml";
            Document document = documentBuilder.parse(path);
            Node root = document.getDocumentElement();
            NodeList books = root.getChildNodes();
            for (int i = 0; i < books.getLength(); i++) {
                Node book = books.item(i);
                if (book.getNodeType() != Node.TEXT_NODE) {
                    NodeList bookProps = book.getChildNodes();
                    for (int j = 0; j < bookProps.getLength(); j++) {
                        Node prop = bookProps.item(j);
                        if (prop.getNodeType() != Node.TEXT_NODE) {
                            System.out.println(prop.getNodeName() + ":" + prop.getChildNodes().item(0).getTextContent());
                        }
                    }
                    System.out.println("===========>>>");
                }
            }
        } catch (ParserConfigurationException | SAXException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
