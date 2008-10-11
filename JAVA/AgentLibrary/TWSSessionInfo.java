/**
 * TWSSessionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package AgentLibrary;

public class TWSSessionInfo  implements java.io.Serializable {
    private java.lang.String agentName;

    private java.lang.String serverName;

    private int stationNumber;

    private AgentLibrary.TWSServiceInfo[] serviceInfoList;

    public TWSSessionInfo() {
    }

    public TWSSessionInfo(
           java.lang.String agentName,
           java.lang.String serverName,
           int stationNumber,
           AgentLibrary.TWSServiceInfo[] serviceInfoList) {
           this.agentName = agentName;
           this.serverName = serverName;
           this.stationNumber = stationNumber;
           this.serviceInfoList = serviceInfoList;
    }


    /**
     * Gets the agentName value for this TWSSessionInfo.
     * 
     * @return agentName
     */
    public java.lang.String getAgentName() {
        return agentName;
    }


    /**
     * Sets the agentName value for this TWSSessionInfo.
     * 
     * @param agentName
     */
    public void setAgentName(java.lang.String agentName) {
        this.agentName = agentName;
    }


    /**
     * Gets the serverName value for this TWSSessionInfo.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this TWSSessionInfo.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the stationNumber value for this TWSSessionInfo.
     * 
     * @return stationNumber
     */
    public int getStationNumber() {
        return stationNumber;
    }


    /**
     * Sets the stationNumber value for this TWSSessionInfo.
     * 
     * @param stationNumber
     */
    public void setStationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }


    /**
     * Gets the serviceInfoList value for this TWSSessionInfo.
     * 
     * @return serviceInfoList
     */
    public AgentLibrary.TWSServiceInfo[] getServiceInfoList() {
        return serviceInfoList;
    }


    /**
     * Sets the serviceInfoList value for this TWSSessionInfo.
     * 
     * @param serviceInfoList
     */
    public void setServiceInfoList(AgentLibrary.TWSServiceInfo[] serviceInfoList) {
        this.serviceInfoList = serviceInfoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TWSSessionInfo)) return false;
        TWSSessionInfo other = (TWSSessionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agentName==null && other.getAgentName()==null) || 
             (this.agentName!=null &&
              this.agentName.equals(other.getAgentName()))) &&
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName()))) &&
            this.stationNumber == other.getStationNumber() &&
            ((this.serviceInfoList==null && other.getServiceInfoList()==null) || 
             (this.serviceInfoList!=null &&
              java.util.Arrays.equals(this.serviceInfoList, other.getServiceInfoList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAgentName() != null) {
            _hashCode += getAgentName().hashCode();
        }
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        _hashCode += getStationNumber();
        if (getServiceInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TWSSessionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSSessionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AgentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSServiceInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
