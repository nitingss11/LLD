package _2_Observer;

public class main {
    public static void main(String[] args) {

        A1_WeatherStation weatherStation = new A1_WeatherStation();

        B1_TemperatureObserver tobs = new B1_TemperatureObserver(weatherStation);
        B2_HumidityObserver hobs = new B2_HumidityObserver(weatherStation);

        weatherStation.newChangesArrive(45, 60);

        weatherStation.removeObserver(hobs);
        
        weatherStation.newChangesArrive(41, 65);


    }
    
}
