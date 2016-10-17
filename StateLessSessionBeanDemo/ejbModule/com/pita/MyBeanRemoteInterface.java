package com.pita;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;


public interface MyBeanRemoteInterface extends EJBObject {
	public String getMessage()throws RemoteException;
	public int add(int noOne,int noTwo)throws RemoteException;
	public int mul(int noOne,int noTwo)throws RemoteException;

}
