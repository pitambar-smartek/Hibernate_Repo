package com.pita.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XsltTesting {

	public static void main(String[] args) throws TransformerException, IOException {
	TransformerFactory factory=TransformerFactory.newInstance();
	//TransformerFactory factoryOne=TransformerFactory.newInstance();
	
	Source xslDoc = new StreamSource("C:/Users/Admin/workspace/XSLT_Using_java_Application/emp.xsl");
	Source xmlDoc = new StreamSource("C:/Users/Admin/workspace/XSLT_Using_java_Application/employees.xml");
	System.out.println("Factroy object="+factory);
	Transformer transformer=factory.newTransformer(xslDoc);
	
	String outputFileName = "C:/Users/Admin/workspace/XSLT_Using_java_Application/empl.xml";
	OutputStream htmlFile = new FileOutputStream(outputFileName);
	transformer.transform(xmlDoc, new StreamResult(htmlFile));
	System.out.println("Output complete");
	 htmlFile.close();

	
	}

}
