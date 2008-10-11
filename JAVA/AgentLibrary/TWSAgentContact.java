/**
 * TWSAgentContact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package AgentLibrary;

public class TWSAgentContact  implements java.io.Serializable {
    private int serviceId;

    private int contactType;

    private int callState;

    private int callId;

    private java.lang.String UCID;

    private int skill;

    private java.lang.String skillDesc;

    private int VDN;

    private java.lang.String VDNDesc;

    private int contactId;

    private int operatorCode;

    private java.lang.String phone;

    private boolean captured;

    private int capturedLogin;

    private java.lang.String establishedURL;

    private java.lang.String closedURL;

    public TWSAgentContact() {
    }

    public TWSAgentContact(
           int serviceId,
           int contactType,
           int callState,
           int callId,
           java.lang.String UCID,
           int skill,
           java.lang.String skillDesc,
           int VDN,
           java.lang.String VDNDesc,
           int contactId,
           int operatorCode,
           java.lang.String phone,
           boolean captured,
           int capturedLogin,
           java.lang.String establishedURL,
           java.lang.String closedURL) {
           this.serviceId = serviceId;
           this.contactType = contactType;
           this.callState = callState;
           this.callId = callId;
           this.UCID = UCID;
           this.skill = skill;
           this.skillDesc = skillDesc;
           this.VDN = VDN;
           this.VDNDesc = VDNDesc;
           this.contactId = contactId;
           this.operatorCode = operatorCode;
           this.phone = phone;
           this.captured = captured;
           this.capturedLogin = capturedLogin;
           this.establishedURL = establishedURL;
           this.closedURL = closedURL;
    }


    /**
     * Gets the serviceId value for this TWSAgentContact.
     * 
     * @return serviceId
     */
    public int getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this TWSAgentContact.
     * 
     * @param serviceId
     */
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the contactType value for this TWSAgentContact.
     * 
     * @return contactType
     */
    public int getContactType() {
        return contactType;
    }


    /**
     * Sets the contactType value for this TWSAgentContact.
     * 
     * @param contactType
     */
    public void setContactType(int contactType) {
        this.contactType = contactType;
    }


    /**
     * Gets the callState value for this TWSAgentContact.
     * 
     * @return callState
     */
    public int getCallState() {
        return callState;
    }


    /**
     * Sets the callState value for this TWSAgentContact.
     * 
     * @param callState
     */
    public void setCallState(int callState) {
        this.callState = callState;
    }


    /**
     * Gets the callId value for this TWSAgentContact.
     * 
     * @return callId
     */
    public int getCallId() {
        return callId;
    }


    /**
     * Sets the callId value for this TWSAgentContact.
     * 
     * @param callId
     */
    public void setCallId(int callId) {
        this.callId = callId;
    }


    /**
     * Gets the UCID value for this TWSAgentContact.
     * 
     * @return UCID
     */
    public java.lang.String getUCID() {
        return UCID;
    }


    /**
     * Sets the UCID value for this TWSAgentContact.
     * 
     * @param UCID
     */
    public void setUCID(java.lang.String UCID) {
        this.UCID = UCID;
    }


    /**
     * Gets the skill value for this TWSAgentContact.
     * 
     * @return skill
     */
    public int getSkill() {
        return skill;
    }


    /**
     * Sets the skill value for this TWSAgentContact.
     * 
     * @param skill
     */
    public void setSkill(int skill) {
        this.skill = skill;
    }


    /**
     * Gets the skillDesc value for this TWSAgentContact.
     * 
     * @return skillDesc
     */
    public java.lang.String getSkillDesc() {
        return skillDesc;
    }


    /**
     * Sets the skillDesc value for this TWSAgentContact.
     * 
     * @param skillDesc
     */
    public void setSkillDesc(java.lang.String skillDesc) {
        this.skillDesc = skillDesc;
    }


    /**
     * Gets the VDN value for this TWSAgentContact.
     * 
     * @return VDN
     */
    public int getVDN() {
        return VDN;
    }


    /**
     * Sets the VDN value for this TWSAgentContact.
     * 
     * @param VDN
     */
    public void setVDN(int VDN) {
        this.VDN = VDN;
    }


    /**
     * Gets the VDNDesc value for this TWSAgentContact.
     * 
     * @return VDNDesc
     */
    public java.lang.String getVDNDesc() {
        return VDNDesc;
    }


    /**
     * Sets the VDNDesc value for this TWSAgentContact.
     * 
     * @param VDNDesc
     */
    public void setVDNDesc(java.lang.String VDNDesc) {
        this.VDNDesc = VDNDesc;
    }


    /**
     * Gets the contactId value for this TWSAgentContact.
     * 
     * @return contactId
     */
    public int getContactId() {
        return contactId;
    }


    /**
     * Sets the contactId value for this TWSAgentContact.
     * 
     * @param contactId
     */
    public void setContactId(int contactId) {
        this.contactId = contactId;
    }


    /**
     * Gets the operatorCode value for this TWSAgentContact.
     * 
     * @return operatorCode
     */
    public int getOperatorCode() {
        return operatorCode;
    }


    /**
     * Sets the operatorCode value for this TWSAgentContact.
     * 
     * @param operatorCode
     */
    public void setOperatorCode(int operatorCode) {
        this.operatorCode = operatorCode;
    }


    /**
     * Gets the phone value for this TWSAgentContact.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this TWSAgentContact.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the captured value for this TWSAgentContact.
     * 
     * @return captured
     */
    public boolean isCaptured() {
        return captured;
    }


    /**
     * Sets the captured value for this TWSAgentContact.
     * 
     * @param captured
     */
    public void setCaptured(boolean captured) {
        this.captured = captured;
    }


    /**
     * Gets the capturedLogin value for this TWSAgentContact.
     * 
     * @return capturedLogin
     */
    public int getCapturedLogin() {
        return capturedLogin;
    }


    /**
     * Sets the capturedLogin value for this TWSAgentContact.
     * 
     * @param capturedLogin
     */
    public void setCapturedLogin(int capturedLogin) {
        this.capturedLogin = capturedLogin;
    }


    /**
     * Gets the establishedURL value for this TWSAgentContact.
     * 
     * @return establishedURL
     */
    public java.lang.String getEstablishedURL() {
        return establishedURL;
    }


    /**
     * Sets the establishedURL value for this TWSAgentContact.
     * 
     * @param establishedURL
     */
    public void setEstablishedURL(java.lang.String establishedURL) {
        this.establishedURL = establishedURL;
    }


    /**
     * Gets the closedURL value for this TWSAgentContact.
     * 
     * @return closedURL
     */
    public java.lang.String getClosedURL() {
        return closedURL;
    }


    /**
     * Sets the closedURL value for this TWSAgentContact.
     * 
     * @param closedURL
     */
    public void setClosedURL(java.lang.String closedURL) {
        this.closedURL = closedURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TWSAgentContact)) return false;
        TWSAgentContact other = (TWSAgentContact) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.serviceId == other.getServiceId() &&
            this.contactType == other.getContactType() &&
            this.callState == other.getCallState() &&
            this.callId == other.getCallId() &&
            ((this.UCID==null && other.getUCID()==null) || 
             (this.UCID!=null &&
              this.UCID.equals(other.getUCID()))) &&
            this.skill == other.getSkill() &&
            ((this.skillDesc==null && other.getSkillDesc()==null) || 
             (this.skillDesc!=null &&
              this.skillDesc.equals(other.getSkillDesc()))) &&
            this.VDN == other.getVDN() &&
            ((this.VDNDesc==null && other.getVDNDesc()==null) || 
             (this.VDNDesc!=null &&
              this.VDNDesc.equals(other.getVDNDesc()))) &&
            this.contactId == other.getContactId() &&
            this.operatorCode == other.getOperatorCode() &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            this.captured == other.isCaptured() &&
            this.capturedLogin == other.getCapturedLogin() &&
            ((this.establishedURL==null && other.getEstablishedURL()==null) || 
             (this.establishedURL!=null &&
              this.establishedURL.equals(other.getEstablishedURL()))) &&
            ((this.closedURL==null && other.getClosedURL()==null) || 
             (this.closedURL!=null &&
              this.closedURL.equals(other.getClosedURL())));
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
        _hashCode += getContactType();
        _hashCode += getCallState();
        _hashCode += getCallId();
        if (getUCID() != null) {
            _hashCode += getUCID().hashCode();
        }
        _hashCode += getSkill();
        if (getSkillDesc() != null) {
            _hashCode += getSkillDesc().hashCode();
        }
        _hashCode += getVDN();
        if (getVDNDesc() != null) {
            _hashCode += getVDNDesc().hashCode();
        }
        _hashCode += getContactId();
        _hashCode += getOperatorCode();
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        _hashCode += (isCaptured() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getCapturedLogin();
        if (getEstablishedURL() != null) {
            _hashCode += getEstablishedURL().hashCode();
        }
        if (getClosedURL() != null) {
            _hashCode += getClosedURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TWSAgentContact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSAgentContact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CallState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CallId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UCID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UCID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skill");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Skill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skillDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SkillDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VDNDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VDNDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OperatorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captured");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Captured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capturedLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CapturedLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishedURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EstablishedURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClosedURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
