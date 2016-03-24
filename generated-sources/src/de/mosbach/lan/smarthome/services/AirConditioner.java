
package de.mosbach.lan.smarthome.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for airConditioner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="airConditioner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="roomName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="state" type="{http://services.smarthome.lan.mosbach.de/}state" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "airConditioner")
public class AirConditioner {

    @XmlAttribute(name = "roomName")
    protected String roomName;
    @XmlAttribute(name = "state")
    protected State state;

    /**
     * Gets the value of the roomName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * Sets the value of the roomName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomName(String value) {
        this.roomName = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setState(State value) {
        this.state = value;
    }

}
