package org.nasir.weather.model;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather implements Serializable {
	

	private static final long serialVersionUID = -7596043903777061405L;
	private String onHand;
	private String onOrder;
		
	public Weather() {
		super();
	}


	public Weather(String locationName, String onHand, String onOrder) {
		super();
		this.onHand = onHand;
		this.onOrder = onOrder;
	}
	


	@JacksonXmlProperty(localName="OnHand")
	public String getOnHand() {
		return onHand;
	}	


	public void setOnHand(String onHand) {
		this.onHand = onHand;
	}

	 @JacksonXmlProperty(localName="OnOrder")
	public String getOnOrder() {
		return onOrder;
	}


	public void setOnOrder(String onOrder) {
		this.onOrder = onOrder;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
	@Override
	public String toString() {
		return "Stock [onHand=" + onHand + ", onOrder=" + onOrder +  "]";
	}

}
