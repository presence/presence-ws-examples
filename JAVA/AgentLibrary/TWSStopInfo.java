/**
 * TWSStopInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package AgentLibrary;

public class TWSStopInfo  implements java.io.Serializable {
    private AgentLibrary.TWSStopReason[] stopReasonList;

    public TWSStopInfo() {
    }

    public TWSStopInfo(
           AgentLibrary.TWSStopReason[] stopReasonList) {
           this.stopReasonList = stopReasonList;
    }


    /**
     * Gets the stopReasonList value for this TWSStopInfo.
     * 
     * @return stopReasonList
     */
    public AgentLibrary.TWSStopReason[] getStopReasonList() {
        return stopReasonList;
    }


    /**
     * Sets the stopReasonList value for this TWSStopInfo.
     * 
     * @param stopReasonList
     */
    public void setStopReasonList(AgentLibrary.TWSStopReason[] stopReasonList) {
        this.stopReasonList = stopReasonList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TWSStopInfo)) return false;
        TWSStopInfo other = (TWSStopInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stopReasonList==null && other.getStopReasonList()==null) || 
             (this.stopReasonList!=null &&
              java.util.Arrays.equals(this.stopReasonList, other.getStopReasonList())));
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
        if (getStopReasonList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStopReasonList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStopReasonList(), i);
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
        new org.apache.axis.description.TypeDesc(TWSStopInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSStopInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopReasonList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StopReasonList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSStopReason"));
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
