package homework6;
import java.io.IOException;

public class Test {
    static String cityName = "Санкт-Петербург";
    static String cityID;
    static String forecastJSON;

    public static void main(String[] args) {
        WeatherApp weatherApp = new WeatherApp();
        try {
            cityID = weatherApp.searchCityByName(cityName);
            forecastJSON = weatherApp.get5DayForecast(cityID);
            System.out.println("Result = " + forecastJSON);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}