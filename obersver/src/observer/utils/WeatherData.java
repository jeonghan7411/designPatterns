package observer.utils;

import java.util.Observable;

/*
    observer들을 직접 관리하고 하는 것들은 부모클래스(Observable)에서 해준다.
 */

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    public void measurementsChanged() {
        setChanged();           //  상태 변경이 일어났다는 것을 알림
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
