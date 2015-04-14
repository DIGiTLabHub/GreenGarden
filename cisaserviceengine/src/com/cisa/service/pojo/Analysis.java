package com.cisa.service.pojo;

import java.io.Serializable;

public class Analysis implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5057177705506337974L;
	private String deviceId;
	private Region region;
	private double[] enhanced_location;

	public Analysis() {
		// TODO Auto-generated constructor stub
	}
	
	public Analysis(String deviceId, Region region, double[] enhanced_location) {
		super();
		this.deviceId = deviceId;
		this.region = region;
		this.enhanced_location = enhanced_location;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public double[] getEnhanced_location() {
		return enhanced_location;
	}

	public void setEnhanced_location(double[] enhanced_location) {
		this.enhanced_location = enhanced_location;
	}
}