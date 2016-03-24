package de.mosbach.lan.smarthome.clients;

import java.util.Collection;

import javax.xml.ws.BindingProvider;

import com.google.common.collect.Iterables;

import de.mosbach.lan.smarthome.services.WindowService;
import de.mosbach.lan.smarthome.services.WindowService_Service;

public class WindowServiceClient {
	
	private WindowService port;
	
	public WindowServiceClient(){
			try{
				final Collection<javax.xml.registry.infomodel.Service> windowServices = UddiClient.getServices("WSO2", "windowService", 1, 0);
				
				final javax.xml.registry.infomodel.Service windowServiceDescription = Iterables.getFirst(windowServices, null);
				final String windowServiceEndpoint = (windowServiceDescription != null)
						? UddiClient.getFirstServiceBinding(windowServiceDescription) : null;
						
				final WindowService_Service ws = new WindowService_Service();
				port = ws.getWindowService();
				final BindingProvider windowBp = (BindingProvider) port;
				windowBp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, windowServiceEndpoint);
			}catch(Exception e){
			
			}
	}
	
	public int openWindow(String roomName){
		if (this.port != null) {
			port.openWindow(roomName);
			return 0;
		}
		return -1;
	}
	
	public int closeWindow(String roomName){
		if (this.port != null) {
			port.closeWindow(roomName);
			return 1;
		}
		return -1;
	}
	
	public void addWindow(String roomName){
		if (this.port != null) {
			port.addWindow(roomName);
		}
	}
	
	public void removeWindow(long windowId){
		if (this.port != null) {
			port.removeWindow(windowId);
		}
	}
}
