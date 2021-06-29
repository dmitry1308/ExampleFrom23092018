package ru.schepin.examples.parsingXML.fromXMLToHTML;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class XslConverter {
    public String xmlToString(String xmlFile, String xslFile) throws Exception {
        // Открыть файлы в виде потоков
        InputStream xml = new FileInputStream(xmlFile);
        InputStream xsl = new FileInputStream(xslFile);
        // Сщоздать источник для транформации из потоков
        StreamSource xmlSource = new StreamSource(xml);
        StreamSource stylesource = new StreamSource(xsl);

        // Создать байтовый поток для результата
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        // СОздать приемноик для результатат из байтового потока
        StreamResult xmlOutput = new StreamResult(bos);
        // Создать трансформатор и выполнить трансформацию
        Transformer transformer = TransformerFactory.newInstance().newTransformer(stylesource);
        transformer.transform(xmlSource, xmlOutput);

        // вернуть результат в виде строки
        return bos.toString();
    }

    public static void main(String[] arg) throws IOException {
        XslConverter c = new XslConverter();

        String xml = "C:\\Users\\Dmitry\\IdeaProjects\\ExampleFrom23092018\\src\\ru\\schepin\\examples\\parsingXML\\fromXMLToHTML\\bookCatalog.xml";
        String xsl = "C:\\Users\\Dmitry\\IdeaProjects\\ExampleFrom23092018\\src\\ru\\schepin\\examples\\parsingXML\\fromXMLToHTML\\example.xsl";
        try {
            String result = c.xmlToString(xml, xsl);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
