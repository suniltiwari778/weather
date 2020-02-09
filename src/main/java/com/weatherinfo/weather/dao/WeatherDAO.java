package com.weatherinfo.weather.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.weatherinfo.weather.entity.CityWeather;

@Repository
public interface WeatherDAO extends CrudRepository<CityWeather, Long>{

	public CityWeather findByCityName(String cityName);
}
