package observerPattern

class WeatherData: Subject {
    val observers: ArrayList<Observer> = ArrayList<Observer>();
    var humidity: Float? = null
    var temperature: Float? = null
    var pressure: Float? = null

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        for (observer in observers) {
           observer.update(humidity!!, temperature!!, pressure!!)
        }
    }

    fun measurementChanged() {
        notifyObservers()
    }

    fun setMeasurement(humidity: Float, temp: Float, pressure: Float) {
        this.humidity = humidity
        this.temperature = temp
        this.pressure = pressure
    }
}
