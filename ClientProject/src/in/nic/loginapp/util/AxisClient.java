package in.nic.loginapp.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class AxisClient {

	public static void main(String[] args) throws ServiceException,RemoteException, MalformedURLException{
	RuleGeneratorServiceLocator locator=new RuleGeneratorServiceLocator();
  RuleGeneratorDelegate	delegate=locator.getRuleGeneratorPort(new URL("put WSDL url"));
  Output outputs[]=delegate.sendData("pit","mohanty");
  for(Output output:outputs )
  {
	  System.out.println("The Acts"+output.getActs()+" "+output.getTypeDesc());
  }
	
		

	}

}
