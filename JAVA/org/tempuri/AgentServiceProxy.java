package org.tempuri;

public class AgentServiceProxy implements org.tempuri.AgentService {
  private String _endpoint = null;
  private org.tempuri.AgentService agentService = null;
  
  public AgentServiceProxy() {
    _initAgentServiceProxy();
  }
  
  private void _initAgentServiceProxy() {
    try {
      agentService = (new org.tempuri.AgentServiceServiceLocator()).getAgentServicePort();
      if (agentService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)agentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)agentService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (agentService != null)
      ((javax.xml.rpc.Stub)agentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.AgentService getAgentService() {
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService;
  }
  
  public int sum(int a, int b) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.sum(a, b);
  }
  
  public java.util.Calendar getServerTime() throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.getServerTime();
  }
  
  public int login(int agentLogin, java.lang.String password, int station, boolean clearCalls) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.login(agentLogin, password, station, clearCalls);
  }
  
  public int logout(int agentLogin, int reasonCode) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.logout(agentLogin, reasonCode);
  }
  
  public int startSession(int agentLogin) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.startSession(agentLogin);
  }
  
  public int stopSession(int agentLogin, int reasonCode) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.stopSession(agentLogin, reasonCode);
  }
  
  public boolean waitForEvent(int agentLogin) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.waitForEvent(agentLogin);
  }
  
  public void getEvent(int agentLogin, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TAgentEventListHolder events) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.getEvent(agentLogin, result, events);
  }
  
  public int finalizeContact(int agentLogin, AgentLibrary.TWSQInfo QInfo) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.finalizeContact(agentLogin, QInfo);
  }
  
  public int answerCall(int agentLogin) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.answerCall(agentLogin);
  }
  
  public int clearCall(int agentLogin) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.clearCall(agentLogin);
  }
  
  public void getAgentName(int agentLogin, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder agentName) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.getAgentName(agentLogin, result, agentName);
  }
  
  public void getServerName(int agentLogin, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder serverName) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.getServerName(agentLogin, result, serverName);
  }
  
  public void getSessionInfo(int agentLogin, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSSessionInfoHolder sessionInfo) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.getSessionInfo(agentLogin, result, sessionInfo);
  }
  
  public void getCurrentContact(int agentLogin, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSAgentContactHolder agentContact) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.getCurrentContact(agentLogin, result, agentContact);
  }
  
  public int getAgentState(int agentLogin) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.getAgentState(agentLogin);
  }
  
  public void getStopReasonsInfo(int agentLogin, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSStopInfoHolder reasonsList) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.getStopReasonsInfo(agentLogin, result, reasonsList);
  }
  
  public void getLogoutReasonsInfo(int agentLogin, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSStopInfoHolder reasonList) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.getLogoutReasonsInfo(agentLogin, result, reasonList);
  }
  
  public void getInvalidQCodesInfo(int agentLogin, int serviceID, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSQCodeInfoHolder QCodesInfo) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.getInvalidQCodesInfo(agentLogin, serviceID, result, QCodesInfo);
  }
  
  public void getUnreachableQCodesInfo(int agentLogin, int serviceID, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSQCodeInfoHolder QCodesInfo) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.getUnreachableQCodesInfo(agentLogin, serviceID, result, QCodesInfo);
  }
  
  public void getValidQCodesCount(int agentLogin, int serviceID, int group, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder numQCodes) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.getValidQCodesCount(agentLogin, serviceID, group, result, numQCodes);
  }
  
  public void getValidQCodesAt(int agentLogin, int serviceID, int group, int index, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSQCodeHolder QCodeInfo) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.getValidQCodesAt(agentLogin, serviceID, group, index, result, QCodeInfo);
  }
  
  public void getCurrentAgentInboundContact(int agentLogin, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSAgentContactInboundHolder inboundContact) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.getCurrentAgentInboundContact(agentLogin, result, inboundContact);
  }
  
  public void getCurrentAgentOutboundContact(int agentLogin, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSAgentContactOutboundHolder outboundContact) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.getCurrentAgentOutboundContact(agentLogin, result, outboundContact);
  }
  
  public void recordOnDemandStart(int agentLogin, java.lang.String appData, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder recordId) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.recordOnDemandStart(agentLogin, appData, result, recordId);
  }
  
  public int recordOnDemandStop(int agentLogin, int recordId) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.recordOnDemandStop(agentLogin, recordId);
  }
  
  public int makeCall(int agentLogin, java.lang.String phone) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.makeCall(agentLogin, phone);
  }
  
  public void consultationCall(int agentLogin, java.lang.String calledPhone, int activeCallID, int consultType, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSCallHolder call) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.consultationCall(agentLogin, calledPhone, activeCallID, consultType, result, call);
  }
  
  public int transferCall(int agentLogin, int callID) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.transferCall(agentLogin, callID);
  }
  
  public int conferenceCall(int agentLogin, int callID) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.conferenceCall(agentLogin, callID);
  }
  
  public int sendTones(int agentLogin, int callID, java.lang.String tones) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.sendTones(agentLogin, callID, tones);
  }
  
  public int contactCall(int agentLogin) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.contactCall(agentLogin);
  }
  
  public int clearAllCalls(int agentLogin) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.clearAllCalls(agentLogin);
  }
  
  
}