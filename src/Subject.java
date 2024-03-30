/**
 * @author Victor Pérez
 * @since 30/03/2024
 * Interfaz que deben implementar las clases sujetos
 */
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
