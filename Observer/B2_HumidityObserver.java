public class B2_HumidityObserver implements B_Observer {

    private A1_WeatherStation weatherStation;

    public B2_HumidityObserver(A1_WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    public void update() {
        System.out.println("I'm displaying humidity " + weatherStation.getHumidity());
    }
    
}
