package com.tejadvv.weather_api.repository;

import com.tejadvv.weather_api.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<Weather,Integer> {
}
