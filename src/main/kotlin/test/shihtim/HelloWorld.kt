package test.shihtim

fun main() {
//    println("Hello Kotlin");
//    Human().hello();
    var s:String?="abcde"
    s=null
    println(s?.length)
    val human=Human("DK",66.5f,1.7f);
    human.hello();
    println(human.bmi())
    var a:Int=123;
    var name:String="我不好"
}

class Human( var name:String, var weight:Float,var height:Float){
    init {
        println("test $weight ")
    }
//    constructor(name:String,weight: Float,height: Float) : this(weight, height){
//        //println(name)
//    }

    fun bmi():Float{
        val bmi=weight/(height*height)
        return bmi
    }
    fun hello(){
        println("Hello Kotlin")
    }
}