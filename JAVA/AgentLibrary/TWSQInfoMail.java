/**
 * TWSQInfoMail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package AgentLibrary;

public class TWSQInfoMail  implements java.io.Serializable {
    private boolean mailCaptured;

    private java.util.Calendar mailCapturedDateTime;

    private int moveToMailboxId;

    public TWSQInfoMail() {
    }

    public TWSQInfoMail(
           boolean mailCaptured,
           java.util.Calendar mailCapturedDateTime,
           int moveToMailboxId) {
           this.mailCaptured = mailCaptured;
           this.mailCapturedDateTime = mailCapturedDateTime;
           this.moveToMailboxId = moveToMailboxId;
    }


    /**
     * Gets the mailCaptured value for this TWSQInfoMail.
     * 
     * @return mailCaptured
     */
    public boolean isMailCaptured() {
        return mailCaptured;
    }


    /**
     * Sets the mailCaptured value for this TWSQInfoMail.
     * 
     * @param mailCaptured
     */
    public void setMailCaptured(boolean mailCaptured) {
        this.mailCaptured = mailCaptured;
    }


    /**
     * Gets the mailCapturedDateTime value for this TWSQInfoMail.
     * 
     * @return mailCapturedDateTime
     */
    public java.util.Calendar getMailCapturedDateTime() {
        return mailCapturedDateTime;
    }


    /**
     * Sets the mailCapturedDateTime value for this TWSQInfoMail.
     * 
     * @param mailCapturedDateTime
     */
    public void setMailCapturedDateTime(java.util.Calendar mailCapturedDateTime) {
        this.mailCapturedDateTime = mailCapturedDateTime;
    }


    /**
     * Gets the moveToMailboxId value for this TWSQInfoMail.
     * 
     * @return moveToMailboxId
     */
    public int getMoveToMailboxId() {
        return moveToMailboxId;
    }


    /**
     * Sets the moveToMailboxId value for this TWSQInfoMail.
     * 
     * @param moveToMailboxId
     */
    public void setMoveToMailboxId(int moveToMailboxId) {
        this.moveToMailboxId = moveToMailboxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TWSQInfoMail)) return false;
        TWSQInfoMail other = (TWSQInfoMail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.mailCaptured == other.isMailCaptured() &&
            ((this.mailCapturedDateTime==null && other.getMailCapturedDateTime()==null) || 
             (this.mailCapturedDateTime!=null &&
              this.mailCapturedDateTime.equals(other.getMailCapturedDateTime()))) &&
            this.moveToMailboxId == other.getMoveToMailboxId();
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
        _hashCode += (isMailCaptured() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMailCapturedDateTime() != null) {
            _hashCode += getMailCapturedDateTime().hashCode();
        }
        _hashCode += getMoveToMailboxId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TWSQInfoMail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSQInfoMail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailCaptured");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MailCaptured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailCapturedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MailCapturedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moveToMailboxId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MoveToMailboxId"));
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
