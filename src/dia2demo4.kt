fun main(){
    fun maxValue(arreglo:IntArray):Int{
        var min = arreglo[0]
        for (e in arreglo){
            if (min<e){
                min = e
            }
        }
        return min
    }
    var valor = maxValue(arreglo = intArrayOf(10,5,8,11,2))
    print(valor)
}