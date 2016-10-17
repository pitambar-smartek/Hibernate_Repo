/**
 * MatchImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ysreddy.shadi.service;

public interface MatchImplService extends javax.xml.rpc.Service {
    public java.lang.String getMatchImplAddress();

    public com.ysreddy.shadi.service.MatchImpl getMatchImpl() throws javax.xml.rpc.ServiceException;

    public com.ysreddy.shadi.service.MatchImpl getMatchImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
