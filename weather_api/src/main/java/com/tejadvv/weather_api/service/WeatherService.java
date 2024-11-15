package com.tejadvv.weather_api.service;

import com.tejadvv.weather_api.model.Weather;
import com.tejadvv.weather_api.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeatherService {
    @Autowired
    WeatherRepository weatherRepository;

    public Weather addWeatherRecord(Weather weather){
        return weatherRepository.save(weather);
    }

    public List<Weather> getAllWeatherRecords() {
        return weatherRepository.findAll();
    }

    public Optional<Weather> findWeatherRecordById(int id) {
        return weatherRepository.findById(id);
    }

    public void deleteWeatherRecordById(int id) {
        weatherRepository.deleteById(id);
    }

    public void updateWeatherRecordById(Weather weather) {
        weatherRepository.save(weather);
    }
}
