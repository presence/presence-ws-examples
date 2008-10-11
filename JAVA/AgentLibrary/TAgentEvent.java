/**
 * TAgentEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package AgentLibrary;

public class TAgentEvent  implements java.io.Serializable {
    private int eventCode;

    private AgentLibrary.TAgentEventField[] eventFields;

    public TAgentEvent() {
    }

    public TAgentEvent(
           int eventCode,
           AgentLibrary.TAgentEventField[] eventFields) {
           this.eventCode = eventCode;
           this.eventFields = eventFields;
    }


    /**
     * Gets the eventCode value for this TAgentEvent.
     * 
     * @return eventCode
     */
    public int getEventCode() {
        return eventCode;
    }


    /**
     * Sets the eventCode value for this TAgentEvent.
     * 
     * @param eventCode
     */
    public void setEventCode(int eventCode) {
        this.eventCode = eventCode;
    }


    /**
     * Gets the eventFields value for this TAgentEvent.
     * 
     * @return eventFields
     */
    public AgentLibrary.TAgentEventField[] getEventFields() {
        return eventFields;
    }


    /**
     * Sets the eventFields value for this TAgentEvent.
     * 
     * @param eventFields
     */
    public void setEventFields(AgentLibrary.TAgentEventField[] eventFields) {
        this.eventFields = eventFields;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TAgentEvent)) return false;
        TAgentEvent other = (TAgentEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventCode == other.getEventCode() &&
            ((this.eventFields==null && other.getEventFields()==null) || 
             (this.eventFields!=null &&
              java.util.Arrays.equals(this.eventFields, other.getEventFields())));
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
        _hashCode += getEventCode();
        if (getEventFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventFields(), i);
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
        new org.apache.axis.description.TypeDesc(TAgentEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TAgentEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EventCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventFields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EventFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TAgentEventField"));
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
