package com.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestClint {

	public static void main(String[] args) throws FileNotFoundException, IOException, NamingException {
		Properties p=new Properties();
		p.load(new FileInputStream("jndi.properties"));
		InitialContext ic=new InitialContext(p);
		MyBeanHomeInterface =(MyBeanHomeInterface)ic.lookup("Hello");
		
	}

}
