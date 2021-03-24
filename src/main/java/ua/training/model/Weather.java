package ua.training.model;

import java.time.LocalDate;
import java.util.Objects;

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

    public Direction getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Direction windDirection) {
        this.windDirection = windDirection;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public Cloudiness getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(Cloudiness cloudiness) {
        this.cloudiness = cloudiness;
    }

    public int getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(int precipitation) {
        this.precipitation = precipitation;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Weather{");
        sb.append("windDirection=").append(windDirection);
        sb.append(", windSpeed=").append(windSpeed);
        sb.append(", minTemperature=").append(minTemperature);
        sb.append(", maxTemperature=").append(maxTemperature);
        sb.append(", cloudiness=").append(cloudiness);
        sb.append(", precipitation=").append(precipitation);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return windSpeed == weather.windSpeed &&
                minTemperature == weather.minTemperature &&
                maxTemperature == weather.maxTemperature &&
                precipitation == weather.precipitation &&
                windDirection == weather.windDirection &&
                cloudiness == weather.cloudiness &&
                date.equals(weather.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(windDirection, windSpeed, minTemperature, maxTemperature, cloudiness, precipitation, date);
    }
}
