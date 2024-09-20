package observer.custom;

import java.util.ArrayList;


/**
 * 주제 인터페이스를 구현 클래스.
 * 날씨 데이터를 관리하고 변경시 옵저버들에게 전달
 */
public class WeatherData implements Subject {
    private ArrayList observers;    //  Observer 객체들을 저장하기 위해
    private float temperature;  //  온도
    private float humidity;     //  습도
    private float pressure;     //  압력

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    // 옵저버들에게 알림
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }


    //  날씨 정보 업데이트
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
