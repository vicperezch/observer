import java.util.ArrayList;

/**
 * @author Victor Pérez
 * @since 30/03/2024
 * Clase que representa una estación meteorológica
 */
public class WeatherStation implements Subject {
    private int temperature;
    private ArrayList<Observer> observers;

    /**
     * Constructor de la clase
     */
    public WeatherStation() {
        observers = new ArrayList<>();
    }

    /**
     * Método que modifica la temperatura
     * @param temperature Temperatura a establecer
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    /**
     * Agrega un observador a la lista de observadores
     * @param observer Observador a agregar
     */
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /** 
     * Elimina un observador de la lista de observadores
     * @param observer Observador a eliminar
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifica a los observadores de un cambio en la temperatura
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
