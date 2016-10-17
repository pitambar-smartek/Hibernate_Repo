/**
 * RuleGeneratorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package in.nic.loginapp.util;

public class RuleGeneratorServiceLocator extends org.apache.axis.client.Service implements in.nic.loginapp.util.RuleGeneratorService {

    public RuleGeneratorServiceLocator() {
    }


    public RuleGeneratorServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RuleGeneratorServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RuleGeneratorPort
    private java.lang.String RuleGeneratorPort_address = "http://localhost:8080/Act_management/RuleGeneratorPort";

    public java.lang.String getRuleGeneratorPortAddress() {
        return RuleGeneratorPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RuleGeneratorPortWSDDServiceName = "RuleGeneratorPort";

    public java.lang.String getRuleGeneratorPortWSDDServiceName() {
        return RuleGeneratorPortWSDDServiceName;
    }

    public void setRuleGeneratorPortWSDDServiceName(java.lang.String name) {
        RuleGeneratorPortWSDDServiceName = name;
    }

    public in.nic.loginapp.util.RuleGeneratorDelegate getRuleGeneratorPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RuleGeneratorPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRuleGeneratorPort(endpoint);
    }

    public in.nic.loginapp.util.RuleGeneratorDelegate getRuleGeneratorPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            in.nic.loginapp.util.RuleGeneratorPortBindingStub _stub = new in.nic.loginapp.util.RuleGeneratorPortBindingStub(portAddress, this);
            _stub.setPortName(getRuleGeneratorPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRuleGeneratorPortEndpointAddress(java.lang.String address) {
        RuleGeneratorPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (in.nic.loginapp.util.RuleGeneratorDelegate.class.isAssignableFrom(serviceEndpointInterface)) {
                in.nic.loginapp.util.RuleGeneratorPortBindingStub _stub = new in.nic.loginapp.util.RuleGeneratorPortBindingStub(new java.net.URL(RuleGeneratorPort_address), this);
                _stub.setPortName(getRuleGeneratorPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RuleGeneratorPort".equals(inputPortName)) {
            return getRuleGeneratorPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://util.loginapp.nic.in/", "RuleGeneratorService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://util.loginapp.nic.in/", "RuleGeneratorPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RuleGeneratorPort".equals(portName)) {
            setRuleGeneratorPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
