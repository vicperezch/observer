/**
 * @author Victor Pérez
 * @since 30/03/2024
 * Clase que representa una advertencia meteorológica
 */
public class WeatherWarning implements Observer {

    @Override
    public void update(int temperature) {
        if (temperature > 40) {
            System.out.println("¡Advertencia! La temperatura es mayor a 40 grados Celsius");
        }
    }
}
