package com.pita;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoReadingFromXml {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Re_architect\\Gtcj_Storage_xml");
		byte b[]=new byte[fis.available()];
		fis.read(b);
		String storageXml=new String(b);
		
		//int startIndex=storageXml.indexOf("<oper:userId>");
		int startIndex=storageXml.lastIndexOf("<ser:type>");
	
		int lastIndex=storageXml.indexOf("</ser:type>");
		
		System.out.println("The index="+startIndex+" LastIndex="+lastIndex);
		
		String subString=storageXml.substring(startIndex+12, lastIndex);
		
		System.out.println("The value="+subString);
		
		//String value=storageXml.

	}

}
