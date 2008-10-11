/**
 * TWSQInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package AgentLibrary;

public class TWSQInfo  implements java.io.Serializable {
    private int QCode;

    private int cType;

    private AgentLibrary.TWSQInfoInbound infoInbound;

    private AgentLibrary.TWSQInfoOutbound infoOutbound;

    private AgentLibrary.TWSQInfoMail infoMail;

    public TWSQInfo() {
    }

    public TWSQInfo(
           int QCode,
           int cType,
           AgentLibrary.TWSQInfoInbound infoInbound,
           AgentLibrary.TWSQInfoOutbound infoOutbound,
           AgentLibrary.TWSQInfoMail infoMail) {
           this.QCode = QCode;
           this.cType = cType;
           this.infoInbound = infoInbound;
           this.infoOutbound = infoOutbound;
           this.infoMail = infoMail;
    }


    /**
     * Gets the QCode value for this TWSQInfo.
     * 
     * @return QCode
     */
    public int getQCode() {
        return QCode;
    }


    /**
     * Sets the QCode value for this TWSQInfo.
     * 
     * @param QCode
     */
    public void setQCode(int QCode) {
        this.QCode = QCode;
    }


    /**
     * Gets the cType value for this TWSQInfo.
     * 
     * @return cType
     */
    public int getCType() {
        return cType;
    }


    /**
     * Sets the cType value for this TWSQInfo.
     * 
     * @param cType
     */
    public void setCType(int cType) {
        this.cType = cType;
    }


    /**
     * Gets the infoInbound value for this TWSQInfo.
     * 
     * @return infoInbound
     */
    public AgentLibrary.TWSQInfoInbound getInfoInbound() {
        return infoInbound;
    }


    /**
     * Sets the infoInbound value for this TWSQInfo.
     * 
     * @param infoInbound
     */
    public void setInfoInbound(AgentLibrary.TWSQInfoInbound infoInbound) {
        this.infoInbound = infoInbound;
    }


    /**
     * Gets the infoOutbound value for this TWSQInfo.
     * 
     * @return infoOutbound
     */
    public AgentLibrary.TWSQInfoOutbound getInfoOutbound() {
        return infoOutbound;
    }


    /**
     * Sets the infoOutbound value for this TWSQInfo.
     * 
     * @param infoOutbound
     */
    public void setInfoOutbound(AgentLibrary.TWSQInfoOutbound infoOutbound) {
        this.infoOutbound = infoOutbound;
    }


    /**
     * Gets the infoMail value for this TWSQInfo.
     * 
     * @return infoMail
     */
    public AgentLibrary.TWSQInfoMail getInfoMail() {
        return infoMail;
    }


    /**
     * Sets the infoMail value for this TWSQInfo.
     * 
     * @param infoMail
     */
    public void setInfoMail(AgentLibrary.TWSQInfoMail infoMail) {
        this.infoMail = infoMail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TWSQInfo)) return false;
        TWSQInfo other = (TWSQInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.QCode == other.getQCode() &&
            this.cType == other.getCType() &&
            ((this.infoInbound==null && other.getInfoInbound()==null) || 
             (this.infoInbound!=null &&
              this.infoInbound.equals(other.getInfoInbound()))) &&
            ((this.infoOutbound==null && other.getInfoOutbound()==null) || 
             (this.infoOutbound!=null &&
              this.infoOutbound.equals(other.getInfoOutbound()))) &&
            ((this.infoMail==null && other.getInfoMail()==null) || 
             (this.infoMail!=null &&
              this.infoMail.equals(other.getInfoMail())));
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
        _hashCode += getQCode();
        _hashCode += getCType();
        if (getInfoInbound() != null) {
            _hashCode += getInfoInbound().hashCode();
        }
        if (getInfoOutbound() != null) {
            _hashCode += getInfoOutbound().hashCode();
        }
        if (getInfoMail() != null) {
            _hashCode += getInfoMail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TWSQInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSQInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoInbound");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InfoInbound"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSQInfoInbound"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoOutbound");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InfoOutbound"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSQInfoOutbound"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoMail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InfoMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSQInfoMail"));
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
