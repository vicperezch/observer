/**
 * @author Victor Pérez
 * @since 30/03/2024
 * Clase que representa un display de temperatura
 */
public class TemperatureDisplay implements Observer {

    @Override
    public void update(int temperature) {
        System.out.println("La temperatura actual es: " + temperature + " grados Celsius");
    }
}
