/**
 * MatchImplSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ysreddy.shadi.service;

import com.ysreddy.shadi.beans.Person;

public class MatchImplSoapBindingImpl implements com.ysreddy.shadi.service.MatchImpl{
    public com.ysreddy.shadi.beans.Person getRichMatch(com.ysreddy.shadi.beans.SearchCriteria criteria) throws java.rmi.RemoteException {
    	System.out.println("Age::"+criteria.getAge());
    	System.out.println("Salary::"+criteria.getSalary());
    	System.out.println("Color::"+criteria.getColor());
    	Person person=new Person();
    	person.setName("Pitambar");
    	person.setCity("Pune");
    	
        return person;
    }

}
