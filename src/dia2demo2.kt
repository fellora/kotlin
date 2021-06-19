fun main() {
    fun findPressure(temperature:Double):Double?{
        var pressure = when {
            temperature < 30.0 -> temperature / 2
            temperature < 50.0 -> temperature / 3
            temperature < 80.0 -> temperature
            else -> null
        }
        return pressure
    }
    var pressure = findPressure(temperature = 30.0)
    print(pressure)

    var pressure2 = findPressure(temperature = 15.0)
    print(pressure2)
}