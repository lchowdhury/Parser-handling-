package parserDemo;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParserHandler extends DefaultHandler {

       public void startDocument()throws SAXException {
              System.out.println("begin parsing document......");
       }

       public void endDocument () throws SAXException {
              System.out.print("end parsing document ");
       }

       public void startElement (String uri, String localName, String qName, Attributes attributes) throws SAXException {
              System.out.print("<" +qName +">");
       }


       public void endElement (String uri, String localName, String qName) throws SAXException  {
              System.out.print("</" + qName + ">");
       }


       public void characters (char ch[], int start, int length) throws SAXException {
              for (int i=start ; i<(start+length);i++){
                     System.out.print(ch[i]);
              }

       }







}


