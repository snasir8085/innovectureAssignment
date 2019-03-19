package org.nasir.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Temperature {

	@JacksonXmlProperty(localName = "min")
	private String minTemp;

	@JacksonXmlProperty(localName = "max")
	private String maxTemp;

	@JacksonXmlProperty(localName = "value")
	private String curTemp;

	@JacksonXmlProperty(localName = "unit")
	private String unit;

	public String getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(String minTemp) {
		this.minTemp = minTemp;
	}

	public String getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(String maxTemp) {
		this.maxTemp = maxTemp;
	}

	public String getCurTemp() {
		return curTemp;
	}

	public void setCurTemp(String curTemp) {
		this.curTemp = curTemp;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Temperature [minTemp=" + minTemp + ", maxTemp=" + maxTemp + ", curTemp=" + curTemp + ", unit=" + unit
				+ "]";
	}

}
