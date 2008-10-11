/**
 * TWSQInfoInbound.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package AgentLibrary;

public class TWSQInfoInbound  implements java.io.Serializable {
    private boolean contactCaptured;

    private java.util.Calendar capturedDateTime;

    public TWSQInfoInbound() {
    }

    public TWSQInfoInbound(
           boolean contactCaptured,
           java.util.Calendar capturedDateTime) {
           this.contactCaptured = contactCaptured;
           this.capturedDateTime = capturedDateTime;
    }


    /**
     * Gets the contactCaptured value for this TWSQInfoInbound.
     * 
     * @return contactCaptured
     */
    public boolean isContactCaptured() {
        return contactCaptured;
    }


    /**
     * Sets the contactCaptured value for this TWSQInfoInbound.
     * 
     * @param contactCaptured
     */
    public void setContactCaptured(boolean contactCaptured) {
        this.contactCaptured = contactCaptured;
    }


    /**
     * Gets the capturedDateTime value for this TWSQInfoInbound.
     * 
     * @return capturedDateTime
     */
    public java.util.Calendar getCapturedDateTime() {
        return capturedDateTime;
    }


    /**
     * Sets the capturedDateTime value for this TWSQInfoInbound.
     * 
     * @param capturedDateTime
     */
    public void setCapturedDateTime(java.util.Calendar capturedDateTime) {
        this.capturedDateTime = capturedDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TWSQInfoInbound)) return false;
        TWSQInfoInbound other = (TWSQInfoInbound) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.contactCaptured == other.isContactCaptured() &&
            ((this.capturedDateTime==null && other.getCapturedDateTime()==null) || 
             (this.capturedDateTime!=null &&
              this.capturedDateTime.equals(other.getCapturedDateTime())));
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
        _hashCode += (isContactCaptured() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCapturedDateTime() != null) {
            _hashCode += getCapturedDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TWSQInfoInbound.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSQInfoInbound"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactCaptured");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactCaptured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capturedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CapturedDateTime"));
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
