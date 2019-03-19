package org.nasir.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City {

	@JacksonXmlProperty(localName = "name")
	private String cityName;

	@JacksonXmlProperty(localName = "id")
	private String id;

	@JacksonXmlProperty(localName = "sun")
	private Sun sunObj;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Sun getSunObj() {
		return sunObj;
	}

	public void setSunObj(Sun sunObj) {
		this.sunObj = sunObj;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", id=" + id + ", sunObj=" + sunObj + "]";
	}

}
