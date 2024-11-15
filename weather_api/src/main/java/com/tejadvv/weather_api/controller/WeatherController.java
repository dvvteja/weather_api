package com.tejadvv.weather_api.controller;

import com.tejadvv.weather_api.model.Weather;
import com.tejadvv.weather_api.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @PostMapping
    public ResponseEntity<Weather> addWeatherRecord(@RequestBody Weather weather){
        return new ResponseEntity<>(weatherService.addWeatherRecord(weather), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Weather>> getAllWeatherRecords(){
        return new ResponseEntity<>(weatherService.getAllWeatherRecords(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Weather>> findWeatherRecordById(@PathVariable int id){
        Optional<Weather> weather= weatherService.findWeatherRecordById(id);
        if(weather.isPresent()){
            return new ResponseEntity<>(weather,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteWeatherRecordById(@PathVariable int id){
        if(weatherService.findWeatherRecordById(id).isPresent()){
            weatherService.deleteWeatherRecordById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
