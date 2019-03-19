package org.nasir.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "current")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Current {

	@JacksonXmlProperty(localName = "temperature")
	private Temperature temp;

	@JacksonXmlProperty(localName = "city")
	private City city;

	public Current() {
		super();
	}

	public Temperature getTemp() {
		return temp;
	}

	public void setTemp(Temperature temp) {
		this.temp = temp;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Current [ temp=" + temp + ", city=" + city + "]";
	}

}
