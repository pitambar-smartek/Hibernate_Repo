package com.pita;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class MyBeanImpl implements SessionBean {
	public MyBeanImpl() {
		System.out.println("This is the pulic Zero argument constructor");
	}

	SessionContext sc;

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("This is the EJB avtivate method");

	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("This is the EJB pasivate method");

	}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("This is the EJB remove method");

	}

	@Override
	public void setSessionContext(SessionContext ctx) throws EJBException,
			RemoteException {
		// TODO Auto-generated method stub
		ctx = sc;
		System.out.println("This is the SessionContext method");

	}

	public void ejbCreate() {
		System.out.println("This is the EJB create method");

	}

	public String getMessage()  {
		System.out.println("This is get message business logic method");
		return ("Hello client,Welcome of EJB world");
	}

	public int add(int noOne, int noTwo)  {
		// TODO Auto-generated method stub
		System.out.println("This is the add Business Logic method");
		return (noOne + noTwo);
	}

	public int mul(int noOne, int noTwo)  {
		// TODO Auto-generated method stub
		System.out.println("This is the mul Business logic method");
		return (noOne * noTwo);
	}
}
