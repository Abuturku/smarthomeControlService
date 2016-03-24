
package de.mosbach.lan.smarthome.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.mosbach.lan.smarthome.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllAirConditionersResponse_QNAME = new QName("http://services.smarthome.lan.mosbach.de/", "getAllAirConditionersResponse");
    private final static QName _AddAirConditionerResponse_QNAME = new QName("http://services.smarthome.lan.mosbach.de/", "addAirConditionerResponse");
    private final static QName _AirConditioner_QNAME = new QName("http://services.smarthome.lan.mosbach.de/", "airConditioner");
    private final static QName _TurnOffAirConditioner_QNAME = new QName("http://services.smarthome.lan.mosbach.de/", "turnOffAirConditioner");
    private final static QName _RemoveAirConditionerResponse_QNAME = new QName("http://services.smarthome.lan.mosbach.de/", "removeAirConditionerResponse");
    private final static QName _TurnOnAirConditioner_QNAME = new QName("http://services.smarthome.lan.mosbach.de/", "turnOnAirConditioner");
    private final static QName _GetAllAirConditioners_QNAME = new QName("http://services.smarthome.lan.mosbach.de/", "getAllAirConditioners");
    private final static QName _RemoveAirConditioner_QNAME = new QName("http://services.smarthome.lan.mosbach.de/", "removeAirConditioner");
    private final static QName _AddAirConditioner_QNAME = new QName("http://services.smarthome.lan.mosbach.de/", "addAirConditioner");
    private final static QName _TurnOffAirConditionerResponse_QNAME = new QName("http://services.smarthome.lan.mosbach.de/", "turnOffAirConditionerResponse");
    private final static QName _TurnOnAirConditionerResponse_QNAME = new QName("http://services.smarthome.lan.mosbach.de/", "turnOnAirConditionerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.mosbach.lan.smarthome.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveAirConditionerResponse }
     * 
     */
    public RemoveAirConditionerResponse createRemoveAirConditionerResponse() {
        return new RemoveAirConditionerResponse();
    }

    /**
     * Create an instance of {@link AddAirConditionerResponse }
     * 
     */
    public AddAirConditionerResponse createAddAirConditionerResponse() {
        return new AddAirConditionerResponse();
    }

    /**
     * Create an instance of {@link TurnOffAirConditionerResponse }
     * 
     */
    public TurnOffAirConditionerResponse createTurnOffAirConditionerResponse() {
        return new TurnOffAirConditionerResponse();
    }

    /**
     * Create an instance of {@link AddAirConditioner }
     * 
     */
    public AddAirConditioner createAddAirConditioner() {
        return new AddAirConditioner();
    }

    /**
     * Create an instance of {@link GetAllAirConditioners }
     * 
     */
    public GetAllAirConditioners createGetAllAirConditioners() {
        return new GetAllAirConditioners();
    }

    /**
     * Create an instance of {@link AirConditioner }
     * 
     */
    public AirConditioner createAirConditioner() {
        return new AirConditioner();
    }

    /**
     * Create an instance of {@link RemoveAirConditioner }
     * 
     */
    public RemoveAirConditioner createRemoveAirConditioner() {
        return new RemoveAirConditioner();
    }

    /**
     * Create an instance of {@link TurnOnAirConditionerResponse }
     * 
     */
    public TurnOnAirConditionerResponse createTurnOnAirConditionerResponse() {
        return new TurnOnAirConditionerResponse();
    }

    /**
     * Create an instance of {@link GetAllAirConditionersResponse }
     * 
     */
    public GetAllAirConditionersResponse createGetAllAirConditionersResponse() {
        return new GetAllAirConditionersResponse();
    }

    /**
     * Create an instance of {@link TurnOffAirConditioner }
     * 
     */
    public TurnOffAirConditioner createTurnOffAirConditioner() {
        return new TurnOffAirConditioner();
    }

    /**
     * Create an instance of {@link TurnOnAirConditioner }
     * 
     */
    public TurnOnAirConditioner createTurnOnAirConditioner() {
        return new TurnOnAirConditioner();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAirConditionersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smarthome.lan.mosbach.de/", name = "getAllAirConditionersResponse")
    public JAXBElement<GetAllAirConditionersResponse> createGetAllAirConditionersResponse(GetAllAirConditionersResponse value) {
        return new JAXBElement<GetAllAirConditionersResponse>(_GetAllAirConditionersResponse_QNAME, GetAllAirConditionersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAirConditionerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smarthome.lan.mosbach.de/", name = "addAirConditionerResponse")
    public JAXBElement<AddAirConditionerResponse> createAddAirConditionerResponse(AddAirConditionerResponse value) {
        return new JAXBElement<AddAirConditionerResponse>(_AddAirConditionerResponse_QNAME, AddAirConditionerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirConditioner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smarthome.lan.mosbach.de/", name = "airConditioner")
    public JAXBElement<AirConditioner> createAirConditioner(AirConditioner value) {
        return new JAXBElement<AirConditioner>(_AirConditioner_QNAME, AirConditioner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TurnOffAirConditioner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smarthome.lan.mosbach.de/", name = "turnOffAirConditioner")
    public JAXBElement<TurnOffAirConditioner> createTurnOffAirConditioner(TurnOffAirConditioner value) {
        return new JAXBElement<TurnOffAirConditioner>(_TurnOffAirConditioner_QNAME, TurnOffAirConditioner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAirConditionerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smarthome.lan.mosbach.de/", name = "removeAirConditionerResponse")
    public JAXBElement<RemoveAirConditionerResponse> createRemoveAirConditionerResponse(RemoveAirConditionerResponse value) {
        return new JAXBElement<RemoveAirConditionerResponse>(_RemoveAirConditionerResponse_QNAME, RemoveAirConditionerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TurnOnAirConditioner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smarthome.lan.mosbach.de/", name = "turnOnAirConditioner")
    public JAXBElement<TurnOnAirConditioner> createTurnOnAirConditioner(TurnOnAirConditioner value) {
        return new JAXBElement<TurnOnAirConditioner>(_TurnOnAirConditioner_QNAME, TurnOnAirConditioner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAirConditioners }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smarthome.lan.mosbach.de/", name = "getAllAirConditioners")
    public JAXBElement<GetAllAirConditioners> createGetAllAirConditioners(GetAllAirConditioners value) {
        return new JAXBElement<GetAllAirConditioners>(_GetAllAirConditioners_QNAME, GetAllAirConditioners.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAirConditioner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smarthome.lan.mosbach.de/", name = "removeAirConditioner")
    public JAXBElement<RemoveAirConditioner> createRemoveAirConditioner(RemoveAirConditioner value) {
        return new JAXBElement<RemoveAirConditioner>(_RemoveAirConditioner_QNAME, RemoveAirConditioner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAirConditioner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smarthome.lan.mosbach.de/", name = "addAirConditioner")
    public JAXBElement<AddAirConditioner> createAddAirConditioner(AddAirConditioner value) {
        return new JAXBElement<AddAirConditioner>(_AddAirConditioner_QNAME, AddAirConditioner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TurnOffAirConditionerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smarthome.lan.mosbach.de/", name = "turnOffAirConditionerResponse")
    public JAXBElement<TurnOffAirConditionerResponse> createTurnOffAirConditionerResponse(TurnOffAirConditionerResponse value) {
        return new JAXBElement<TurnOffAirConditionerResponse>(_TurnOffAirConditionerResponse_QNAME, TurnOffAirConditionerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TurnOnAirConditionerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.smarthome.lan.mosbach.de/", name = "turnOnAirConditionerResponse")
    public JAXBElement<TurnOnAirConditionerResponse> createTurnOnAirConditionerResponse(TurnOnAirConditionerResponse value) {
        return new JAXBElement<TurnOnAirConditionerResponse>(_TurnOnAirConditionerResponse_QNAME, TurnOnAirConditionerResponse.class, null, value);
    }

}
