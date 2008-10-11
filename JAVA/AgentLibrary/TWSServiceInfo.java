/**
 * TWSServiceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package AgentLibrary;

public class TWSServiceInfo  implements java.io.Serializable {
    private int serviceId;

    private java.lang.String serviceName;

    private int serviceState;

    private int serviceType;

    private int serviceIntegrationType;

    public TWSServiceInfo() {
    }

    public TWSServiceInfo(
           int serviceId,
           java.lang.String serviceName,
           int serviceState,
           int serviceType,
           int serviceIntegrationType) {
           this.serviceId = serviceId;
           this.serviceName = serviceName;
           this.serviceState = serviceState;
           this.serviceType = serviceType;
           this.serviceIntegrationType = serviceIntegrationType;
    }


    /**
     * Gets the serviceId value for this TWSServiceInfo.
     * 
     * @return serviceId
     */
    public int getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this TWSServiceInfo.
     * 
     * @param serviceId
     */
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceName value for this TWSServiceInfo.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this TWSServiceInfo.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the serviceState value for this TWSServiceInfo.
     * 
     * @return serviceState
     */
    public int getServiceState() {
        return serviceState;
    }


    /**
     * Sets the serviceState value for this TWSServiceInfo.
     * 
     * @param serviceState
     */
    public void setServiceState(int serviceState) {
        this.serviceState = serviceState;
    }


    /**
     * Gets the serviceType value for this TWSServiceInfo.
     * 
     * @return serviceType
     */
    public int getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this TWSServiceInfo.
     * 
     * @param serviceType
     */
    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the serviceIntegrationType value for this TWSServiceInfo.
     * 
     * @return serviceIntegrationType
     */
    public int getServiceIntegrationType() {
        return serviceIntegrationType;
    }


    /**
     * Sets the serviceIntegrationType value for this TWSServiceInfo.
     * 
     * @param serviceIntegrationType
     */
    public void setServiceIntegrationType(int serviceIntegrationType) {
        this.serviceIntegrationType = serviceIntegrationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TWSServiceInfo)) return false;
        TWSServiceInfo other = (TWSServiceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.serviceId == other.getServiceId() &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            this.serviceState == other.getServiceState() &&
            this.serviceType == other.getServiceType() &&
            this.serviceIntegrationType == other.getServiceIntegrationType();
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
        _hashCode += getServiceId();
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        _hashCode += getServiceState();
        _hashCode += getServiceType();
        _hashCode += getServiceIntegrationType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TWSServiceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSServiceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceIntegrationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceIntegrationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
