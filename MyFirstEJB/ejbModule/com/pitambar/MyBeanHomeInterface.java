package com.pitambar;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface MyBeanHomeInterface extends EJBHome {
	public MyBeanRemoteInterface create()throws RemoteException,CreateException;

}