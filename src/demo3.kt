fun main (){
    fun ageOldOrYoung(edad:Int):String{
        val result:String
        if (edad>18){
            result = "Eres mayor de Edad"
        } else{
        result = "Eres menor de Edad"
        }
        return result
    }
    val age = ageOldOrYoung(edad = 33)
    println(age)
}