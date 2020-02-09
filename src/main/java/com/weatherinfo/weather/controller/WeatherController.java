package com.weatherinfo.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.weatherinfo.weather.dao.WeatherDAO;
import com.weatherinfo.weather.entity.CityWeather;

@RestController
public class WeatherController {
	
	@Autowired
    private WeatherDAO weatherDAO;
	
	@GetMapping("/api/weather/city-name")
	@ResponseBody
	public CityWeather getCityWeatherByName(@RequestParam String cityName){
		
		return weatherDAO.findByCityName(cityName);
		
	}
	
	@GetMapping("/api/weather/all-city")
	@ResponseBody
	public List<CityWeather> getCityWeather(){
		
		return (List<CityWeather>) weatherDAO.findAll();
		
	}

}
