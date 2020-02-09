package com.weatherinfo.weather.init;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.weatherinfo.weather.dao.WeatherDAO;
import com.weatherinfo.weather.entity.CityWeather;

@Component
public class DataInit implements ApplicationRunner{
	
	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	
	private WeatherDAO weatherDAO;
	
	  @Autowired
	    public DataInit(WeatherDAO weatherDAO) {
	        this.weatherDAO = weatherDAO;
	    }
	 
	  
	    @Override
	    public void run(ApplicationArguments args) throws Exception {
	        long count = weatherDAO.count();
	 
	        if (count == 0) {
	            CityWeather weatherDataS1 = new CityWeather();
	 
	            weatherDataS1.setCityName("Sydney");
	            Date calendarDate = df.parse("2020-02-20");
	            weatherDataS1.setCalendarDate(calendarDate);;
	            weatherDataS1.setMinTemperature(17);
	            weatherDataS1.setMaxTemperature(21);
	            weatherDataS1.setWindSpeed((long) 24);
	            
	            
	            CityWeather weatherDataAd = new CityWeather();
	            
	            weatherDataAd.setCityName("Adelaide");
	            Date calendarDateAd = df.parse("2020-02-20");
	            weatherDataAd.setCalendarDate(calendarDateAd);;
	            weatherDataAd.setMinTemperature(17);
	            weatherDataAd.setMaxTemperature(22);
	            weatherDataAd.setWindSpeed((long) 31);
	            
	            
	            
	            CityWeather weatherDataBr = new CityWeather();
	            
	            weatherDataBr.setCityName("Brisbane");
	            Date calendarDateBr = df.parse("2020-02-20");
	            weatherDataBr.setCalendarDate(calendarDateBr);;
	            weatherDataBr.setMinTemperature(16);
	            weatherDataBr.setMaxTemperature(24);
	            weatherDataBr.setWindSpeed((long) 30);
	            
	            
	            CityWeather weatherDataCn = new CityWeather();
	            
	            weatherDataCn.setCityName("Canberra");
	            Date calendarDateCn = df.parse("2020-02-20");
	            weatherDataCn.setCalendarDate(calendarDateCn);;
	            weatherDataCn.setMinTemperature(16);
	            weatherDataCn.setMaxTemperature(18);
	            weatherDataCn.setWindSpeed((long) 29);
	            
	           
	            CityWeather weatherDataDa = new CityWeather();
	            
	            weatherDataDa.setCityName("Darwin");
	            Date calendarDateDa = df.parse("2020-02-20");
	            weatherDataDa.setCalendarDate(calendarDateDa);;
	            weatherDataDa.setMinTemperature(16);
	            weatherDataDa.setMaxTemperature(18);
	            weatherDataDa.setWindSpeed((long) 28);
	            
	            	            
	            CityWeather weatherDataHo = new CityWeather();
	            
	            weatherDataHo.setCityName("Hobart");
	            Date calendarDateHo = df.parse("2020-02-20");
	            weatherDataHo.setCalendarDate(calendarDateHo);;
	            weatherDataHo.setMinTemperature(16);
	            weatherDataHo.setMaxTemperature(25);
	            weatherDataHo.setWindSpeed((long) 27);
	            
	            
	            CityWeather weatherDataMe = new CityWeather();
	            
	            weatherDataMe.setCityName("Melbourne");
	            Date calendarDateMe = df.parse("2020-02-20");
	            weatherDataMe.setCalendarDate(calendarDateMe);;
	            weatherDataMe.setMinTemperature(16);
	            weatherDataMe.setMaxTemperature(25);
	            weatherDataMe.setWindSpeed((long) 26);
	            
	            CityWeather weatherDataPe = new CityWeather();
	            
	            weatherDataPe.setCityName("Perth");
	            Date calendarDatePe = df.parse("2020-02-20");
	            weatherDataPe.setCalendarDate(calendarDatePe);;
	            weatherDataPe.setMinTemperature(16);
	            weatherDataPe.setMaxTemperature(19);
	            weatherDataPe.setWindSpeed((long) 25);
	            
	            
	            weatherDAO.save(weatherDataS1);
	            weatherDAO.save(weatherDataAd);
	            weatherDAO.save(weatherDataBr);
	            weatherDAO.save(weatherDataCn);
	            weatherDAO.save(weatherDataDa);
	            weatherDAO.save(weatherDataHo);
	            weatherDAO.save(weatherDataMe);
	            weatherDAO.save(weatherDataPe);
		           
	        }
	 
	    }

}
