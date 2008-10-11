/**
 * TWSQInfoOutbound.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package AgentLibrary;

public class TWSQInfoOutbound  implements java.io.Serializable {
    private java.lang.String phone;

    private java.lang.String name;

    private java.lang.String comments;

    private java.util.Calendar dateSchedule;

    private java.util.Calendar timeSchedule;

    private boolean captured;

    public TWSQInfoOutbound() {
    }

    public TWSQInfoOutbound(
           java.lang.String phone,
           java.lang.String name,
           java.lang.String comments,
           java.util.Calendar dateSchedule,
           java.util.Calendar timeSchedule,
           boolean captured) {
           this.phone = phone;
           this.name = name;
           this.comments = comments;
           this.dateSchedule = dateSchedule;
           this.timeSchedule = timeSchedule;
           this.captured = captured;
    }


    /**
     * Gets the phone value for this TWSQInfoOutbound.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this TWSQInfoOutbound.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the name value for this TWSQInfoOutbound.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TWSQInfoOutbound.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the comments value for this TWSQInfoOutbound.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this TWSQInfoOutbound.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the dateSchedule value for this TWSQInfoOutbound.
     * 
     * @return dateSchedule
     */
    public java.util.Calendar getDateSchedule() {
        return dateSchedule;
    }


    /**
     * Sets the dateSchedule value for this TWSQInfoOutbound.
     * 
     * @param dateSchedule
     */
    public void setDateSchedule(java.util.Calendar dateSchedule) {
        this.dateSchedule = dateSchedule;
    }


    /**
     * Gets the timeSchedule value for this TWSQInfoOutbound.
     * 
     * @return timeSchedule
     */
    public java.util.Calendar getTimeSchedule() {
        return timeSchedule;
    }


    /**
     * Sets the timeSchedule value for this TWSQInfoOutbound.
     * 
     * @param timeSchedule
     */
    public void setTimeSchedule(java.util.Calendar timeSchedule) {
        this.timeSchedule = timeSchedule;
    }


    /**
     * Gets the captured value for this TWSQInfoOutbound.
     * 
     * @return captured
     */
    public boolean isCaptured() {
        return captured;
    }


    /**
     * Sets the captured value for this TWSQInfoOutbound.
     * 
     * @param captured
     */
    public void setCaptured(boolean captured) {
        this.captured = captured;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TWSQInfoOutbound)) return false;
        TWSQInfoOutbound other = (TWSQInfoOutbound) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.dateSchedule==null && other.getDateSchedule()==null) || 
             (this.dateSchedule!=null &&
              this.dateSchedule.equals(other.getDateSchedule()))) &&
            ((this.timeSchedule==null && other.getTimeSchedule()==null) || 
             (this.timeSchedule!=null &&
              this.timeSchedule.equals(other.getTimeSchedule()))) &&
            this.captured == other.isCaptured();
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
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getDateSchedule() != null) {
            _hashCode += getDateSchedule().hashCode();
        }
        if (getTimeSchedule() != null) {
            _hashCode += getTimeSchedule().hashCode();
        }
        _hashCode += (isCaptured() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TWSQInfoOutbound.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AgentLibrary", "TWSQInfoOutbound"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TimeSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captured");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Captured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
