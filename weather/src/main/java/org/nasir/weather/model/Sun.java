package org.nasir.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sun {

	@JacksonXmlProperty(localName = "set")
	private String sunSet;

	@JacksonXmlProperty(localName = "rise")
	private String sunRise;

	public String getSunSet() {
		return sunSet;
	}

	public void setSunSet(String sunSet) {
		this.sunSet = sunSet;
	}

	public String getSunRise() {
		return sunRise;
	}

	public void setSunRise(String sunRise) {
		this.sunRise = sunRise;
	}

	@Override
	public String toString() {
		return "Sun [sunSet=" + sunSet + ", sunRise=" + sunRise + "]";
	}

}
