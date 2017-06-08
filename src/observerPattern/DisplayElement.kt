package observerPattern


open interface DisplayElement {
    fun display()
}

class CurrentConditionDisplay(val weatherData: WeatherData): Observer, DisplayElement {
    var temperature: Float? = null
    var humidity: Float? = null
    var pressure: Float? = null
    init {
        this.weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("Current conditions: ${temperature}F degress and $humidity% humidity")
    }
}

class StatisticDisplay(val weatherData: WeatherData): Observer, DisplayElement {
    var temperature: Float? = null
    var humidity: Float? = null
    var pressure: Float? = null
    init {
        this.weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("Statistic display")
    }
}
