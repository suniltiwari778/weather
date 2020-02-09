package com.weatherinfo.weather.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "WEATHER_DATA")
public class CityWeather {
	
	@Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
	private Long cityId;
	
	@Column(name = "City", length = 64, nullable = false)
	private String cityName;
	
	@Temporal(TemporalType.DATE)
    @Column(name = "Weather_Cal_Date", nullable = false)
	private Date calendarDate;
	
	private double  minTemperature;
	private double  maxTemperature;
	private Long  windSpeed;
	
	
	
	public CityWeather() {
		super();
		
	}



	public CityWeather(String cityName, Date calendarDate, double minTemperature, double maxTemperature,
			Long windSpeed) {
		super();
		this.cityName = cityName;
		this.calendarDate = calendarDate;
		this.minTemperature = minTemperature;
		this.maxTemperature = maxTemperature;
		this.windSpeed = windSpeed;
	}



	public String getCityName() {
		return cityName;
	}



	public void setCityName(String cityName) {
		this.cityName = cityName;
	}



	public Date getCalendarDate() {
		return calendarDate;
	}



	public void setCalendarDate(Date calendarDate) {
		this.calendarDate = calendarDate;
	}



	public double getMinTemperature() {
		return minTemperature;
	}



	public void setMinTemperature(double minTemperature) {
		this.minTemperature = minTemperature;
	}



	public double getMaxTemperature() {
		return maxTemperature;
	}



	public void setMaxTemperature(double maxTemperature) {
		this.maxTemperature = maxTemperature;
	}



	public Long getWindSpeed() {
		return windSpeed;
	}



	public void setWindSpeed(Long windSpeed) {
		this.windSpeed = windSpeed;
	}



	@Override
	public String toString() {
		return "CityWeather [cityName=" + cityName + ", calendarDate=" + calendarDate + ", minTemperature="
				+ minTemperature + ", maxTemperature=" + maxTemperature + ", windSpeed=" + windSpeed + "]";
	}


	
	

}
