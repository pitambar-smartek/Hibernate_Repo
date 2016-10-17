package com.ysreddy.shadi.service;

public class MatchImplProxy implements com.ysreddy.shadi.service.MatchImpl {
  private String _endpoint = null;
  private com.ysreddy.shadi.service.MatchImpl matchImpl = null;
  
  public MatchImplProxy() {
    _initMatchImplProxy();
  }
  
  public MatchImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initMatchImplProxy();
  }
  
  private void _initMatchImplProxy() {
    try {
      matchImpl = (new com.ysreddy.shadi.service.MatchImplServiceLocator()).getMatchImpl();
      if (matchImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)matchImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)matchImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (matchImpl != null)
      ((javax.xml.rpc.Stub)matchImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ysreddy.shadi.service.MatchImpl getMatchImpl() {
    if (matchImpl == null)
      _initMatchImplProxy();
    return matchImpl;
  }
  
  public com.ysreddy.shadi.beans.Person getRichMatch(com.ysreddy.shadi.beans.SearchCriteria criteria) throws java.rmi.RemoteException{
    if (matchImpl == null)
      _initMatchImplProxy();
    return matchImpl.getRichMatch(criteria);
  }
  
  
}