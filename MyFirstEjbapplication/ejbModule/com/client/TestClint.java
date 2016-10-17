package com.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

import javax.ejb.CreateException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.pita.MyBeanHomeInterface;
import com.pita.MyBeanRemoteInterface;

public class TestClint {

	public static void main(String[] args) throws FileNotFoundException, IOException, NamingException, CreateException {
		Properties p=new Properties();
		p.load(new FileInputStream("C:/Users/Admin/workspace/MyFirstEjbapplication/ejbModule/com/client/jndi.properties"));
		InitialContext ic=new InitialContext(p);
		MyBeanHomeInterface mbbi=(MyBeanHomeInterface)ic.lookup("Hello");
		MyBeanRemoteInterface rm=mbbi.create();
		System.out.println(rm.add(23, 34)+"The addition of two thing");
		
		
		/*Hashtable props = new Hashtable();
		props.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
		props.put(Context.PROVIDER_URL,"t3://localhost:7001");
		props.put(Context.SECURITY_PRINCIPAL,"weblogic");
		props.put(Context.SECURITY_CREDENTIALS,"pita1234#");
		InitialContext ctx = new InitialContext(props);
		System.out.println(ctx);*/
		
		
		
		/*Context ctx = null;
		Hashtable ht = new Hashtable();
		ht.put(Context.INITIAL_CONTEXT_FACTORY,
		       "weblogic.jndi.WLInitialContextFactory");
		ht.put(Context.PROVIDER_URL,
		       "http://localhost:7001");
		try {
		  ctx = new InitialContext(ht);
		  // Use the context in your program
		  MyBeanHomeInterface mbbi=(MyBeanHomeInterface)ctx.lookup("Hello");
			MyBeanRemoteInterface rm=mbbi.create();
			System.out.println(rm.add(23, 34)+"The addition of two thing");
		}
		catch (NamingException e) {
		  // a failure occurred
		}
		finally {
		  try {ctx.close();}
		  catch (Exception e) {
		    // a failure occurred
		  }
		}
*/
		
		
		
		
		
	}

}
