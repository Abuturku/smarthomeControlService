package de.mosbach.lan.smarthome.clients;

import java.util.Collection;

import javax.xml.ws.BindingProvider;

import com.google.common.collect.Iterables;

import de.mosbach.lan.smarthome.services.HeaterService;
import de.mosbach.lan.smarthome.services.HeaterService_Service;

public class HeaterServiceClient {
	
	private HeaterService port;
	
	public HeaterServiceClient(){
			try{
				final Collection<javax.xml.registry.infomodel.Service> heaterServices = UddiClient.getServices("WSO2", "heaterService", 1, 0);
				
				final javax.xml.registry.infomodel.Service heaterServiceDescription = Iterables.getFirst(heaterServices, null);
				final String heaterServiceEndpoint = (heaterServiceDescription != null)
						? UddiClient.getFirstServiceBinding(heaterServiceDescription) : null;
						
				final HeaterService_Service ws = new HeaterService_Service();
				port = ws.getHeaterService();
				final BindingProvider heaterBp = (BindingProvider) port;
				heaterBp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, heaterServiceEndpoint);
			}catch(Exception e){
			
			}
	}
	
	public int turnOffHeater(String roomName){
		if (port != null) {
			port.turnOffHeater(roomName);
			return 1;
		}
		return -1;
	}
	
	public int turnOnHeater(String roomName){
		if (port != null) {
			port.turnOnHeater(roomName);
			return 0;
		}
		return -1;
	}
}
