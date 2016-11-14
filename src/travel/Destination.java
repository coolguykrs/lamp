package travel;

import java.util.function.DoubleFunction;

/**
 * Created by Kristjan on 09/11/2016.
 */
public class Destination implements DestinationModel {

    private Temperature tempInKelvins;

    private String name;

    public Destination(String name, double minTemp, double maxTemp) {
        this.name = name;
        this.tempInKelvins = new Temperature(minTemp, maxTemp);
    }

    public double getCelsius() {
        return tempInKelvins.getTemperature() - 273.15;
    }

    public double getFahrenheit() {
        return this.getCelsius() * 9 / 5 + 32;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getKelvin() {
        return tempInKelvins.getTemperature();
    }

    @Override
    public double getAvgWeather(DoubleFunction<Double, Double, Double> tempHandler) {
        return tempHandler.apply(tempInKelvins.getTemperature());
    }

    public static double convertToCelsius(double temp) {
        return temp - 273.15;
    }
}
