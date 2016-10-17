import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class DomParser {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		Document doc=builder.parse(DomParser.class.getClassLoader().getResourceAsStream("demo.xml"));
        NodeList htable=doc.getDocumentElement().getElementsByTagName("h:td");
        Node htd=htable.item(0);
        Node htdChild=htd.getFirstChild();
        String tdvalue=htdChild.getNodeValue();
        System.out.println("The node valueis "+tdvalue);
	}

}
