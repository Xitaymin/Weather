package ua.training.model;

import java.time.LocalDate;

public class Weather {
    private Direction windDirection;
    private int windSpeed;
    private int minTemperature;
    private int maxTemperature;
    private Cloudiness cloudiness;
    private int precipitation;
    private LocalDate date;

    public Weather(Direction windDirection,int windSpeed,int minTemperature, int maxTemperature,Cloudiness cloudiness,int precipitation, LocalDate date) {
    this.windDirection = windDirection;
    this.windSpeed = windSpeed;
    this.minTemperature = minTemperature;
    this.maxTemperature = maxTemperature;
    this.cloudiness = cloudiness;
    this.precipitation = precipitation;
    this.date = date;
    }

    public Weather(Direction windDirection,int windSpeed,int minTemperature, int maxTemperature,Cloudiness cloudiness,int precipitation) {
        this(windDirection,windSpeed,minTemperature,maxTemperature,cloudiness,precipitation,LocalDate.now());
    }
}
