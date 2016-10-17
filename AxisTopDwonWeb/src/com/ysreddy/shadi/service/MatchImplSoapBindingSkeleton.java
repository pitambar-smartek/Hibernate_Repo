/**
 * MatchImplSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ysreddy.shadi.service;

public class MatchImplSoapBindingSkeleton implements com.ysreddy.shadi.service.MatchImpl, org.apache.axis.wsdl.Skeleton {
    private com.ysreddy.shadi.service.MatchImpl impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.shadi.ysreddy.com", "criteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.shadi.ysreddy.com", "SearchCriteria"), com.ysreddy.shadi.beans.SearchCriteria.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getRichMatch", _params, new javax.xml.namespace.QName("http://service.shadi.ysreddy.com", "getRichMatchReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.shadi.ysreddy.com", "Person"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://service.shadi.ysreddy.com", "getRichMatch"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getRichMatch") == null) {
            _myOperations.put("getRichMatch", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getRichMatch")).add(_oper);
    }

    public MatchImplSoapBindingSkeleton() {
        this.impl = new com.ysreddy.shadi.service.MatchImplSoapBindingImpl();
    }

    public MatchImplSoapBindingSkeleton(com.ysreddy.shadi.service.MatchImpl impl) {
        this.impl = impl;
    }
    public com.ysreddy.shadi.beans.Person getRichMatch(com.ysreddy.shadi.beans.SearchCriteria criteria) throws java.rmi.RemoteException
    {
        com.ysreddy.shadi.beans.Person ret = impl.getRichMatch(criteria);
        return ret;
    }

}
