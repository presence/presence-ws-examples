/**
 * AgentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface AgentService extends java.rmi.Remote {
    public int sum(int a, int b) throws java.rmi.RemoteException;
    public java.util.Calendar getServerTime() throws java.rmi.RemoteException;
    public int login(int agentLogin, java.lang.String password, int station, boolean clearCalls) throws java.rmi.RemoteException;
    public int logout(int agentLogin, int reasonCode) throws java.rmi.RemoteException;
    public int startSession(int agentLogin) throws java.rmi.RemoteException;
    public int stopSession(int agentLogin, int reasonCode) throws java.rmi.RemoteException;
    public boolean waitForEvent(int agentLogin) throws java.rmi.RemoteException;
    public void getEvent(int agentLogin, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TAgentEventListHolder events) throws java.rmi.RemoteException;
    public int finalizeContact(int agentLogin, AgentLibrary.TWSQInfo QInfo) throws java.rmi.RemoteException;
    public int answerCall(int agentLogin) throws java.rmi.RemoteException;
    public int clearCall(int agentLogin) throws java.rmi.RemoteException;
    public void getAgentName(int agentLogin, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder agentName) throws java.rmi.RemoteException;
    public void getServerName(int agentLogin, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder serverName) throws java.rmi.RemoteException;
    public void getSessionInfo(int agentLogin, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSSessionInfoHolder sessionInfo) throws java.rmi.RemoteException;
    public void getCurrentContact(int agentLogin, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSAgentContactHolder agentContact) throws java.rmi.RemoteException;
    public int getAgentState(int agentLogin) throws java.rmi.RemoteException;
    public void getStopReasonsInfo(int agentLogin, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSStopInfoHolder reasonsList) throws java.rmi.RemoteException;
    public void getLogoutReasonsInfo(int agentLogin, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSStopInfoHolder reasonList) throws java.rmi.RemoteException;
    public void getInvalidQCodesInfo(int agentLogin, int serviceID, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSQCodeInfoHolder QCodesInfo) throws java.rmi.RemoteException;
    public void getUnreachableQCodesInfo(int agentLogin, int serviceID, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSQCodeInfoHolder QCodesInfo) throws java.rmi.RemoteException;
    public void getValidQCodesCount(int agentLogin, int serviceID, int group, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder numQCodes) throws java.rmi.RemoteException;
    public void getValidQCodesAt(int agentLogin, int serviceID, int group, int index, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSQCodeHolder QCodeInfo) throws java.rmi.RemoteException;
    public void getCurrentAgentInboundContact(int agentLogin, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSAgentContactInboundHolder inboundContact) throws java.rmi.RemoteException;
    public void getCurrentAgentOutboundContact(int agentLogin, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSAgentContactOutboundHolder outboundContact) throws java.rmi.RemoteException;
    public void recordOnDemandStart(int agentLogin, java.lang.String appData, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder recordId) throws java.rmi.RemoteException;
    public int recordOnDemandStop(int agentLogin, int recordId) throws java.rmi.RemoteException;
    public int makeCall(int agentLogin, java.lang.String phone) throws java.rmi.RemoteException;
    public void consultationCall(int agentLogin, java.lang.String calledPhone, int activeCallID, int consultType, javax.xml.rpc.holders.IntHolder result, AgentLibrary.holders.TWSCallHolder call) throws java.rmi.RemoteException;
    public int transferCall(int agentLogin, int callID) throws java.rmi.RemoteException;
    public int conferenceCall(int agentLogin, int callID) throws java.rmi.RemoteException;
    public int sendTones(int agentLogin, int callID, java.lang.String tones) throws java.rmi.RemoteException;
    public int contactCall(int agentLogin) throws java.rmi.RemoteException;
    public int clearAllCalls(int agentLogin) throws java.rmi.RemoteException;
}
