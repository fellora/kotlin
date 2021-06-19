fun main(){
    fun calculateAreaCircle(radio:Double):Double{
        val area = radio*radio*Math.PI
        return area
    }
    val areaCircle = calculateAreaCircle(radio = 8.0)
    println(areaCircle)

    fun calculateAreaRectangle(base:Double, height:Double):Double{
        val area = base*height
        return area
    }
    val areaRectangle = calculateAreaRectangle(base = 2.0, height = 5.0)
        print(areaRectangle)
}