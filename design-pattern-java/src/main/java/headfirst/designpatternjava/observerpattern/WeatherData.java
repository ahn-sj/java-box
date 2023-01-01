package headfirst.designpatternjava.observerpattern;

public class WeatherData {

    public void measurementsChanged() {
        float temp = getTemperature();  // 온도
        float humidity = getHumidity(); // 습도
        float pressure = getPressure(); // 기압

        currentConditionsDisplay.update(temp, humidity, pressure); // 디스플레이1. 현재 기상 조건
        statisticsDisplay.update(temp, humidity, pressure);        // 디스플레이2. 기상 통계
        forecastDisplay.update(temp, humidity, pressure);          // 디스플레이3. 기상 예측 항목
    }
}
