fun main(){
    fun findWord(text:String, input:String):Int{
        var result:Int
        result = 0
        for (i in text.toLowerCase()){
            if (i.toString() == input){
                result++
            }
        }
        return result
    }
    val conteo = findWord(text = "La palAbra esta impplicita", input = "a")
    print(conteo)
}