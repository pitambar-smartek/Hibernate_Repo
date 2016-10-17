/**
 * SearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ysreddy.shadi.beans;

public class SearchCriteria  implements java.io.Serializable {
    private int age;

    private java.lang.String color;

    private double salary;

    public SearchCriteria() {
    }

    public SearchCriteria(
           int age,
           java.lang.String color,
           double salary) {
           this.age = age;
           this.color = color;
           this.salary = salary;
    }


    /**
     * Gets the age value for this SearchCriteria.
     * 
     * @return age
     */
    public int getAge() {
        return age;
    }


    /**
     * Sets the age value for this SearchCriteria.
     * 
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * Gets the color value for this SearchCriteria.
     * 
     * @return color
     */
    public java.lang.String getColor() {
        return color;
    }


    /**
     * Sets the color value for this SearchCriteria.
     * 
     * @param color
     */
    public void setColor(java.lang.String color) {
        this.color = color;
    }


    /**
     * Gets the salary value for this SearchCriteria.
     * 
     * @return salary
     */
    public double getSalary() {
        return salary;
    }


    /**
     * Sets the salary value for this SearchCriteria.
     * 
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchCriteria)) return false;
        SearchCriteria other = (SearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.age == other.getAge() &&
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            this.salary == other.getSalary();
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
        _hashCode += getAge();
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        _hashCode += new Double(getSalary()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.shadi.ysreddy.com", "SearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.shadi.ysreddy.com", "age"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("color");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.shadi.ysreddy.com", "color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.shadi.ysreddy.com", "salary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
