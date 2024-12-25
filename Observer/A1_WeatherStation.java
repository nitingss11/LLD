import java.util.*;

public class A1_WeatherStation implements A_Subject {
    
    private int temperature;
    private int humidity;
    private List<B_Observer> observers = new ArrayList<>();

    public void addObserver(B_Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(B_Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(B_Observer observer : observers) {
            observer.update();
        }
    }

    //Consider it the source of change of data 
    public void newChangesArrive(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

    //Adding getters to make the design push+pull
    public int getTemperature() {
        return this.temperature;
    }

    public int getHumidity() {
        return this.humidity;
    }

}
