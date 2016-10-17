package com.pita.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.ysreddy.shadi.beans.Person;
import com.ysreddy.shadi.beans.SearchCriteria;
import com.ysreddy.shadi.service.MatchImpl;
import com.ysreddy.shadi.service.MatchImplServiceLocator;

public class AxisClient {
	public static void main(String args[]) throws ServiceException, RemoteException{
		MatchImplServiceLocator locator=new MatchImplServiceLocator();
		MatchImpl match=locator.getMatchImpl();
		SearchCriteria criteria=new SearchCriteria();
		criteria.setAge(26);
		criteria.setColor("fair");
		criteria.setSalary(9875);
		
		Person person=match.getRichMatch(criteria);
		System.out.println("Better Match for u.....");
		System.out.println("Person Name::"+person.getName());
		System.out.println("Person city::"+person.getCity());
		
	}

}
