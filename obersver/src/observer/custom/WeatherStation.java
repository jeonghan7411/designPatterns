package observer.custom;

/*
    push 방식  주제가 옵저버들에게 알림을 전송한다.
    느슨한 결합 : 주제와 옵저버는 서로의 구체적인 구현을 알 필요 없이 인터페이스를 통해 상호작용 함
    확장성 : 새로운 디스플레이 유형(옵저버)을 쉽게 추가할 수 있다.
 */

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
