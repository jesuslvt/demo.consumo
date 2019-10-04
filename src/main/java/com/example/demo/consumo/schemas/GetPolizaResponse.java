//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.08.15 a las 03:24:52 PM COT 
//


package com.example.demo.consumo.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Exceptions" type="{http://memorynotfound.com/contract}Exceptions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isValid",
    "exceptions"
})
@XmlRootElement(name = "getPolizaResponse")
public class GetPolizaResponse {

    protected boolean isValid;
    @XmlElement(name = "Exceptions")
    protected List<Exceptions> exceptions;

    /**
     * Obtiene el valor de la propiedad isValid.
     * 
     */
    public boolean isIsValid() {
        return isValid;
    }

    /**
     * Define el valor de la propiedad isValid.
     * 
     */
    public void setIsValid(boolean value) {
        this.isValid = value;
    }

    /**
     * Gets the value of the exceptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Exceptions }
     * 
     * 
     */
    public List<Exceptions> getExceptions() {
        if (exceptions == null) {
            exceptions = new ArrayList<Exceptions>();
        }
        return this.exceptions;
    }

}
