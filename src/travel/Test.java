package travel;

/**
 * Created by Kristjan on 09/11/2016.
 */
public class Test {
    public static void main(String[] args) {

        Destination destination1 = new Destination("Koht1", 273.15, 290);
        Destination destination2 = new Destination("Koht2", 290, 290);
        Destination destination3 = new Destination("Koht3", 260, 300);

        System.out.println(destination1.getCelsius());
        System.out.println(destination1.getFahrenheit());

        double celsius = destination1.getAvgWeather(min, max  -> min + max asjad?? - 273.25);
        System.out.println(celsius);

        double fahrenheit = destination1.getAvgWeather(s -> s * 9 / 5 - 459.67);
        System.out.println(fahrenheit);

        double celsius2 = destination1.getAvgWeather(Destination::convertToCelsius);
        System.out.println(celsius2);
    }
}
