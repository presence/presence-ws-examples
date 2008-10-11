/**
 * AgentServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AgentServiceServiceLocator extends org.apache.axis.client.Service implements org.tempuri.AgentServiceService {

/**
 * Service AgentService. This service has been automatically generated
 * using the RODL template you can find in the Templates directory.
 */

    public AgentServiceServiceLocator() {
    }


    public AgentServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AgentServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AgentServicePort
    private java.lang.String AgentServicePort_address = "http://localhost/AgentWS/pcoagentws.dll/SOAP";

    public java.lang.String getAgentServicePortAddress() {
        return AgentServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AgentServicePortWSDDServiceName = "AgentServicePort";

    public java.lang.String getAgentServicePortWSDDServiceName() {
        return AgentServicePortWSDDServiceName;
    }

    public void setAgentServicePortWSDDServiceName(java.lang.String name) {
        AgentServicePortWSDDServiceName = name;
    }

    public org.tempuri.AgentService getAgentServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AgentServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAgentServicePort(endpoint);
    }

    public org.tempuri.AgentService getAgentServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.AgentServiceBindingStub _stub = new org.tempuri.AgentServiceBindingStub(portAddress, this);
            _stub.setPortName(getAgentServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAgentServicePortEndpointAddress(java.lang.String address) {
        AgentServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.AgentService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.AgentServiceBindingStub _stub = new org.tempuri.AgentServiceBindingStub(new java.net.URL(AgentServicePort_address), this);
                _stub.setPortName(getAgentServicePortWSDDServiceName());
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
        if ("AgentServicePort".equals(inputPortName)) {
            return getAgentServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "AgentServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "AgentServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AgentServicePort".equals(portName)) {
            setAgentServicePortEndpointAddress(address);
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
