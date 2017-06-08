package observerPattern

fun main(args: Array<String>) {
    val weatherData: WeatherData = WeatherData()
    CurrentConditionDisplay(weatherData)
    StatisticDisplay(weatherData)

    weatherData.setMeasurement(80F, 65F, 30.5F)
    weatherData.measurementChanged()

    weatherData.setMeasurement(90F, 60F, 35F)
    weatherData.measurementChanged()
}
