package de.mosbach.lan.smarthome.clients;

import java.util.Collection;

import javax.xml.ws.BindingProvider;

import com.google.common.collect.Iterables;

import de.mosbach.lan.smarthome.services.AirConditionerService;
import de.mosbach.lan.smarthome.services.AirConditionerService_Service;

public class AirConditionerServiceClient {
	
	private AirConditionerService port;
	
	public AirConditionerServiceClient(){
			try{
				final Collection<javax.xml.registry.infomodel.Service> airConditionerServices = UddiClient.getServices("WSO2", "airConditionerService", 1, 0);
				
				final javax.xml.registry.infomodel.Service airConditionerServiceDescription = Iterables.getFirst(airConditionerServices, null);
				final String airConditionerServiceEndpoint = (airConditionerServiceDescription != null)
						? UddiClient.getFirstServiceBinding(airConditionerServiceDescription) : null;
						
				final AirConditionerService_Service ws = new AirConditionerService_Service();
				port = ws.getAirConditionerService();
				final BindingProvider airConditionerBp = (BindingProvider) port;
				airConditionerBp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, airConditionerServiceEndpoint);
			}catch(Exception e){
			
			}
	}
	
	public int turnOnAc(String roomName){
		if (port != null) {
			port.turnOnAirConditioner(roomName);
			return 0;
		}
		return -1;
	}
	
	public int turnOffAc(String roomName){
		if (port != null) {
			port.turnOffAirConditioner(roomName);
			return 1;
		}
		return -1;
	}
}
