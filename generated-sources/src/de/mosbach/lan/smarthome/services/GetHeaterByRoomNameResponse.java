
package de.mosbach.lan.smarthome.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getHeaterByRoomNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getHeaterByRoomNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://services.smarthome.lan.mosbach.de/}heater" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHeaterByRoomNameResponse", propOrder = {
    "_return"
})
public class GetHeaterByRoomNameResponse {

    @XmlElement(name = "return")
    protected Heater _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Heater }
     *     
     */
    public Heater getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Heater }
     *     
     */
    public void setReturn(Heater value) {
        this._return = value;
    }

}
