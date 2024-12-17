package ru.cbr.cbrservice.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

@Service
public class CatalogParser {

    private String serviceUrl = "http://www.cbr.ru/scripts/XML_daily.asp";

    @PostConstruct
    public void parse() throws ParserConfigurationException, IOException, SAXException {
        System.out.println("Hello World!");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(serviceUrl);
        NodeList nodeList = document.getElementsByTagName("Valute");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            System.out.println(element.getElementsByTagName("Name").item(0).getTextContent());
        }

    }
}