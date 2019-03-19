package org.nasir.weather.controller;

import java.net.URI;

import org.nasir.weather.model.Current;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Controller
public class WeatherController {

	@RequestMapping(value = "/getWeatherDetails", method = RequestMethod.GET)
	public ModelAndView getWeatherDetails(@RequestParam("zipcode") String zipcode)

	{
		if (zipcode == null || zipcode.length() <= 0) {
			return new ModelAndView("mainPage");
		}
		ModelAndView modelAndView = new ModelAndView("weatherdetails");
		try {

			RestTemplate restTemplate = new RestTemplate();

			String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + zipcode
					+ ",us&mode=xml&units=metric&appid=d0be846d811bdcb36c46f4f6e299f92d";
			ResponseEntity<String> response;
			response = restTemplate.getForEntity(new URI(url), String.class);

			String xmlString = response.getBody();
			XmlMapper xmlMapper = new XmlMapper();

			Current weatherReport = xmlMapper.readValue(xmlString, Current.class);

			modelAndView.addObject("zipcode", zipcode);
			modelAndView.addObject("weatherListData", weatherReport);
			return modelAndView;

		} catch (JsonParseException e) {
			e.printStackTrace();
			modelAndView.addObject("error", "Error Occurred");
		} catch (HttpClientErrorException e) {
			e.printStackTrace();
			modelAndView.addObject("error", "Zip Code is Invalid");
		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.addObject("error", "Zip Code is Invalid");
		}

		return modelAndView;
	}

}
