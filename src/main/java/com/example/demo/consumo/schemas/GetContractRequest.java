//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.08.15 a las 03:24:52 PM COT 
//


package com.example.demo.consumo.schemas;

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
 *         &lt;element name="map" type="{http://memorynotfound.com/contract}map"/&gt;
 *         &lt;element name="huellaYFirmaCliente" type="{http://memorynotfound.com/contract}HuellaYFirmaCliente"/&gt;
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
    "map",
    "huellaYFirmaCliente"
})
@XmlRootElement(name = "getContractRequest")
public class GetContractRequest {

    @XmlElement(required = true)
    protected Map map;
    @XmlElement(required = true)
    protected HuellaYFirmaCliente huellaYFirmaCliente;

    /**
     * Obtiene el valor de la propiedad map.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getMap() {
        return map;
    }

    /**
     * Define el valor de la propiedad map.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setMap(Map value) {
        this.map = value;
    }

    /**
     * Obtiene el valor de la propiedad huellaYFirmaCliente.
     * 
     * @return
     *     possible object is
     *     {@link HuellaYFirmaCliente }
     *     
     */
    public HuellaYFirmaCliente getHuellaYFirmaCliente() {
        return huellaYFirmaCliente;
    }

    /**
     * Define el valor de la propiedad huellaYFirmaCliente.
     *
     * @param value
     *     allowed object is
     *     {@link HuellaYFirmaCliente }
     *     
     */
    public void setHuellaYFirmaCliente(HuellaYFirmaCliente value) {
        this.huellaYFirmaCliente = value;
    }

    @Override
    public String toString() {
        return "GetContractRequest{" +
                "map=" + map +
                ", huellaYFirmaCliente=" + huellaYFirmaCliente +
                '}';
    }
}
