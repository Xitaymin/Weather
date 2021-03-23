package ua.training.model;

public class Weather {
    private Direction windDirection;
    private int windSpeed;
    private int minTemperature;
    private int maxTemperature;
    private Cloudiness cloudiness;
    private int precipitation;

    public Weather(Direction windDirection,int windSpeed,int minTemperature, int maxTemperature,Cloudiness cloudiness,int precipitation) {
    this.windDirection = windDirection;
    this.windSpeed = windSpeed;
    this.minTemperature = minTemperature;
    this.maxTemperature = maxTemperature;
    this.cloudiness = cloudiness;
    this.precipitation = precipitation;
    }


}
