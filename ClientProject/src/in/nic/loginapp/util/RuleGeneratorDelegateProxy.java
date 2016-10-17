package in.nic.loginapp.util;

public class RuleGeneratorDelegateProxy implements in.nic.loginapp.util.RuleGeneratorDelegate {
  private String _endpoint = null;
  private in.nic.loginapp.util.RuleGeneratorDelegate ruleGeneratorDelegate = null;
  
  public RuleGeneratorDelegateProxy() {
    _initRuleGeneratorDelegateProxy();
  }
  
  public RuleGeneratorDelegateProxy(String endpoint) {
    _endpoint = endpoint;
    _initRuleGeneratorDelegateProxy();
  }
  
  private void _initRuleGeneratorDelegateProxy() {
    try {
      ruleGeneratorDelegate = (new in.nic.loginapp.util.RuleGeneratorServiceLocator()).getRuleGeneratorPort();
      if (ruleGeneratorDelegate != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ruleGeneratorDelegate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ruleGeneratorDelegate)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ruleGeneratorDelegate != null)
      ((javax.xml.rpc.Stub)ruleGeneratorDelegate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public in.nic.loginapp.util.RuleGeneratorDelegate getRuleGeneratorDelegate() {
    if (ruleGeneratorDelegate == null)
      _initRuleGeneratorDelegateProxy();
    return ruleGeneratorDelegate;
  }
  
  public in.nic.loginapp.util.Output[] sendData(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (ruleGeneratorDelegate == null)
      _initRuleGeneratorDelegateProxy();
    return ruleGeneratorDelegate.sendData(arg0, arg1);
  }
  
  
}