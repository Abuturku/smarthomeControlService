package de.mosbach.lan.smarthome.smarthomeControlService;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import de.mosbach.lan.smarthome.clients.AirConditionerServiceClient;
import de.mosbach.lan.smarthome.clients.HeaterServiceClient;
import de.mosbach.lan.smarthome.clients.WindowServiceClient;

@WebService(serviceName = "smarthomeControlService", name = "smarthomeControlService", portName = "smarthomeControlService")
public class SmarthomeControlService {
	private WindowServiceClient ws = new WindowServiceClient();
	private HeaterServiceClient hs = new HeaterServiceClient();
	private AirConditionerServiceClient as = new AirConditionerServiceClient();

	public List<Integer> shutdownAll(@XmlElement(required = true, name = "roomName") String roomName) {
		List<Integer> status = new ArrayList<Integer>();
		status.add(ws.closeWindow(roomName));
		status.add(hs.turnOffHeater(roomName));
		status.add(as.turnOffAc(roomName));
		return status;
	}

	public List<Integer> openWindows(@XmlElement(required = true, name = "roomName") String roomName) {
		List<Integer> status = new ArrayList<Integer>();
		status.add(ws.openWindow(roomName));
		status.add(hs.turnOffHeater(roomName));
		status.add(as.turnOffAc(roomName));
		return status;
	}

	public List<Integer> turnOnHeater(@XmlElement(required = true, name = "roomName") String roomName) {
		List<Integer> status = new ArrayList<Integer>();
		status.add(ws.closeWindow(roomName));
		status.add(hs.turnOnHeater(roomName));
		status.add(as.turnOffAc(roomName));
		return status;
	}

	public List<Integer> turnOnAirConditioner(@XmlElement(required = true, name = "roomName") String roomName) {
		List<Integer> status = new ArrayList<Integer>();
		status.add(ws.closeWindow(roomName));
		status.add(hs.turnOffHeater(roomName));
		status.add(as.turnOnAc(roomName));
		return status;
	}

}
