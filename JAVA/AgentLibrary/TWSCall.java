/**
 * TWSCall.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package AgentLibrary;

public class TWSCall  implements java.io.Serializable {
    private int callID;

    private java.lang.String callingDevice;

    private java.lang.String calledDevice;

    private java.lang.String serviceCustomerPhoneDesc;

    private int callType;

    private int state;

    private int selected;

    private int inConference;

    private java.util.Calendar startTimeStamp;

    private java.util.Calendar stateTimeStamp;

    public TWSCall() {
    }

    public TWSCall(
           int callID,
           java.lang.String callingDevice,
           java.lang.String calledDevice,
           java.lang.String serviceCustomerPhoneDesc,
           int callType,
           int state,
           int selected,
           int inConference,
           java.util.Calendar startTimeStamp,
           java.util.Calendar stateTimeStamp) {
           this.callID = callID;
           this.callingDevice = callingDevice;
           this.calledDevice = calledDevice;
           this.serviceCustomerPhoneDesc = serviceCustomerPhoneDesc;
           this.callType = callType;
           this.state = state;
           this.selected = selected;
           this.inConference = inConference;
           this.startTimeStamp = startTimeStamp;
           this.stateTimeStamp = stateTimeStamp;
    }


    /**
     * Gets the callID value for this TWSCall.
     * 
     * @return callID
     */
    public int getCallID() {
        return callID;
    }


    /**
     * Sets the callID value for this TWSCall.
     * 
     * @param callID
     */
    public void setCallID(int callID) {
        this.callID = callID;
    }


    /**
     * Gets the callingDevice value for this TWSCall.
     * 
     * @return callingDevice
     */
    public java.lang.String getCallingDevice() {
        return callingDevice;
    }


    /**
     * Sets the callingDevice value for this TWSCall.
     * 
     * @param callingDevice
     */
    public void setCallingDevice(java.lang.String callingDevice) {
        this.callingDevice = callingDevice;
    }


    /**
     * Gets the calledDevice value for this TWSCall.
     * 
     * @return calledDevice
     */
    public java.lang.String getCalledDevice() {
        return calledDevice;
    }


    /**
     * Sets the calledDevice value for this TWSCall.
     * 
     * @param calledDevice
     */
    public void setCalledDevice(java.lang.String calledDevice) {
        this.calledDevice = calledDevice;
    }


    /**
     * Gets the serviceCustomerPhoneDesc value for this TWSCall.
     * 
     * @return serviceCustomerPhoneDesc
     */
    public java.lang.String getServiceCustomerPhoneDesc() {
        return serviceCustomerPhoneDesc;
    }


    /**
     * Sets the serviceCustomerPhoneDesc value for this TWSCall.
     * 
     * @param serviceCustomerPhoneDesc
     */
    public void setServiceCustomerPhoneDesc(java.lang.String serviceCustomerPhoneDesc) {
        this.serviceCustomerPhoneDesc = serviceCustomerPhoneDesc;
    }


    /**
     * Gets the callType value for this TWSCall.
     * 
     * @return callType
     */
    public int getCallType() {
        return callType;
    }


    /**
     * Sets the callType value for this TWSCall.
     * 
     * @param callType
     */
    public void setCallType(int callType) {
        this.callType = callType;
    }


    /**
     * Gets the state value for this TWSCall.
     * 
     * @return state
     */
    public int getState() {
        return state;
    }


    /**
     * Sets the state value for this TWSCall.
     * 
     * @param state
     */
    public void setState(int state) {
        this.state = state;
    }


    /**
     * Gets the selected value for this TWSCall.
     * 
     * @return selected
     */
    public int getSelected() {
        return selected;
    }


    /**
     * Sets the selected value for this TWSCall.
     * 
     * @param selected
     */
    public void setSelected(int selected) {
        this.selected = selected;
    }


    /**
     * Gets the inConference value for this TWSCall.
     * 
     * @return inConference
     */
    public int getInConference() {
        return inConference;
    }


    /**
     * Sets the inConference value for this TWSCall.
     * 
     * @param inConference
     */
    public void setInConference(int inConference) {
        this.inConference = inConference;
    }


    /**
     * Gets the startTimeStamp value for this TWSCall.
     * 
     * @return startTimeStamp
     */
    public java.util.Calendar getStartTimeStamp() {
        return startTimeStamp;
    }


    /**
     * Sets the startTimeStamp value for this TWSCall.
     * 
     * @param startTimeStamp
     */
    public void setStartTimeStamp(java.util.Calendar startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }


    /**
     * Gets the stateTimeStamp value for this TWSCall.
     * 
     * @return stateTimeStamp
     */
    public java.util.Calendar getStateTimeStamp() {
        return stateTimeStamp;
    }


    /**
     * Sets the stateTimeStamp value for this TWSCall.
     * 
     * @param stateTimeStamp
     */
    public void setStateTimeStamp(java.util.Calendar stateTimeStamp) {
        this.stateTimeStamp = stateTimeStamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TWSCall)) return false;
        TWSCall other = (TWSCall) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.callID == other.getCallID() &&
            ((this.callingDevice==null && other.getCallingDevice()==null) || 
             (this.callingDevice!=null &&
              this.callingDevice.equals(other.getCallingDevice()))) &&
            ((this.calledDevice==null && other.getCalledDevice()==null) || 
             (this.calledDevice!=null &&
              this.calledDevice.equals(other.getCalledDevice()))) &&
            ((this.serviceCustomerPhoneDesc==null && other.getServiceCustomerPhoneDesc()==null) || 
             (this.serviceCustomerPhoneDesc!=null &&
              this.serviceCustomerPhoneDesc.equals(other.getServiceCustomerPhoneDesc()))) &&
            this.callType == other.getCallType() &&
            this.state == other.getState() &&
            this.selected == other.getSelected() &&
            this.inConference == other.getInConference() &&
            ((this.startTimeStamp==null && other.getStartTimeStamp()==null) || 
             (this.startTimeStamp!=null &&
              this.startTimeStamp.equals(other.getStartTimeStamp()))) &&
            ((this.stateTimeStamp==null && other.getStateTimeStamp()==null) || 
             (this.stateTimeStamp!=null &&
              this.stateTimeStamp.equals(other.getStateTimeStamp())));
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
        _hashCode += getCallID();
        if (getCallingDevice() != null) {
            _hashCode += getCallingDevice().hashCode();
        }
        if (getCalledDevice() != null) {
            _hashCode += getCalledDevice().hashCode();
        }
        if (getServiceCustomerPhoneDesc() != null) {
            _hashCode += getServiceCustomerPhoneDesc().hashCode();
        }
        _hashCode += getCallType();
        _hashCode += getState();
        _hashCode += getSelected();
        _hashCode += getInConference();
        if (getStartTimeStamp() != null) {
            _hashCode += getStartTimeStamp().hashCode();
        }
        if (getStateTimeStamp() != null) {
            _hashCode += getStateTimeStamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TWSCall.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSCall"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CallID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CallingDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CalledDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCustomerPhoneDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceCustomerPhoneDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CallType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Selected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inConference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InConference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StateTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
