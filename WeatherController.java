package com.example.weather_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {

    @GetMapping("/")
    public String getIndex()
    {
        return  "index";
    }

    @GetMapping("/weather")
    {
        public String getWeather(@RequestParam("city") String city, Model model)
        {
            
        }
    }
}
