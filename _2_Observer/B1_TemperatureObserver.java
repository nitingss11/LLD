package _2_Observer;

public class B1_TemperatureObserver implements B_Observer {

    //Sinch Observers can only point to one subject. Might as well be concrete
    private A1_WeatherStation weatherStation;

    //subscribe to the subject in init itself
    public B1_TemperatureObserver(A1_WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    public void update() {

        System.out.println("I'm displaying temperature " + weatherStation.getTemperature());

    }
    
}
