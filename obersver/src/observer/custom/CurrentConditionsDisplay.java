package observer.custom;


/*
    WeatherData 객체로부터 변경 사항을 받기 위해서 Observer를 구현
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // 업데이트된 정보를 받아서 화면에 갱신
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degress and " + humidity + "% humidity");
    }
}
