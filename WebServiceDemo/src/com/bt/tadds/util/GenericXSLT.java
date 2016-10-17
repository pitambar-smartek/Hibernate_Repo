package com.bt.tadds.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class GenericXSLT {
	private static TransformerFactory transformerFactory = null;

	private TransformerFactory getTransformerFactory() {
		if (transformerFactory == null) {
			transformerFactory = TransformerFactory.newInstance();
			return transformerFactory;
		} else {
			return transformerFactory;
		}

	}
	private Transformer getTransformer(StreamSource streamSource) throws TransformerConfigurationException{
		
			return transformerFactory.newTransformer(streamSource);
			//new StreamSource("C:/Users/Admin/workspace/XSLT_Using_java_Application/emp.xsl")
		
	}
	public StreamResult getStreamResult(String xmlMessage,StreamSource streamSource){
		return null;
		
	}
	public DOMResult getDomResult(String xmlMessage){
		return null;
	}
	public SAXResult getSAXResult(String xmlMessage){
		return null;
		
	}

	public static void main(String[] args) throws TransformerException,
			IOException {
		TransformerFactory factory = TransformerFactory.newInstance();
		// TransformerFactory factoryOne=TransformerFactory.newInstance();

		Source xslDoc = new StreamSource(
				"C:/Users/Admin/workspace/XSLT_Using_java_Application/emp.xsl");
		Source xmlDoc = new StreamSource(
				"C:/Users/Admin/workspace/XSLT_Using_java_Application/employees.xml");
		System.out.println("Factroy object=" + factory);
		Transformer transformer = factory.newTransformer(xslDoc);
		Transformer one = factory.newTransformer(xslDoc);
		System.out.println("One" + one + "  Two=" + transformer);

		String outputFileName = "C:/Users/Admin/workspace/XSLT_Using_java_Application/empl.xml";
		OutputStream htmlFile = new FileOutputStream(outputFileName);
		transformer.transform(xmlDoc, new StreamResult(htmlFile));
		
		System.out.println("Output complete");
		htmlFile.close();

	}

}
