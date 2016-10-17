package com.pita.controller;

import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Module {

	public static void main(String[] args) {
		try {
			TransformerFactory tFactory = TransformerFactory.newInstance();

			Source xslDoc = new StreamSource("C:/Users/Admin/workspace/XSLT_Using_java_Application/catalog.xsl");
			Source xmlDoc = new StreamSource("C:/Users/Admin/workspace/XSLT_Using_java_Application/catalogue.xml");

			String outputFileName = "C:/Users/Admin/workspace/XSLT_Using_java_Application/catalog.html";
			OutputStream htmlFile = new FileOutputStream(outputFileName);

			Transformer transformer = tFactory.newTransformer(xslDoc);
			transformer.transform(xmlDoc, new StreamResult(htmlFile));
			System.out.println("Successfully transfermed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
