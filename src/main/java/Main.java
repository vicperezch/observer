/**
 * @author Victor Pérez
 * @since 30/03/2024
 * Clase principal
 */
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(weatherWarning);

        weatherStation.setTemperature(25);
        System.out.println();
        
        weatherStation.setTemperature(45);
    }
}
