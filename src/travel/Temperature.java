package travel;

/**
 * Created by Kristjan on 14/11/2016.
 */
public class Temperature {

    private double minimumTemp;
    private double maximumTemp;

    public Temperature(double minimumTemp, double maximumTemp) {
        this.minimumTemp = minimumTemp;
        this.maximumTemp = maximumTemp;
    }

    public double getTemperature() {
        return minimumTemp + maximumTemp / 2;
    }

}
