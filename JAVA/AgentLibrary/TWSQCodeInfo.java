/**
 * TWSQCodeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package AgentLibrary;

public class TWSQCodeInfo  implements java.io.Serializable {
    private AgentLibrary.TWSQCode[] QCodeList;

    public TWSQCodeInfo() {
    }

    public TWSQCodeInfo(
           AgentLibrary.TWSQCode[] QCodeList) {
           this.QCodeList = QCodeList;
    }


    /**
     * Gets the QCodeList value for this TWSQCodeInfo.
     * 
     * @return QCodeList
     */
    public AgentLibrary.TWSQCode[] getQCodeList() {
        return QCodeList;
    }


    /**
     * Sets the QCodeList value for this TWSQCodeInfo.
     * 
     * @param QCodeList
     */
    public void setQCodeList(AgentLibrary.TWSQCode[] QCodeList) {
        this.QCodeList = QCodeList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TWSQCodeInfo)) return false;
        TWSQCodeInfo other = (TWSQCodeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.QCodeList==null && other.getQCodeList()==null) || 
             (this.QCodeList!=null &&
              java.util.Arrays.equals(this.QCodeList, other.getQCodeList())));
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
        if (getQCodeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQCodeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQCodeList(), i);
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
        new org.apache.axis.description.TypeDesc(TWSQCodeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSQCodeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QCodeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QCodeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSQCode"));
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
