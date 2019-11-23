package test.shihtim.studentkt

import java.util.*

fun main(){
//    userInput()
    val student=Student("DK",60,89)
    student.print()
    println("最高分:${student.heiggest()}")
}



class Student(var name:String?,var english:Int,var math:Int) {
    fun heiggest():Int{
        var max=if(english>math) english else math
        return max
    }

    fun print(){
        println(name + "\t" + english + "\t" + math + "\t" + getAverage()+"\t"+
                if (getAverage()>60) print("PASS") else print("FAILED"))
    }

    fun getAverage():Int {
        return (english + math) / 2
    }
    fun nameCheck(){
        println(name?.length)
    }
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    println("Please enter student's name:")
    var name: String? = null
    println("Please enter student's english:")
    var english: Int = scanner.nextInt()
    println("Please enter student's math:")
    var math: Int = scanner.nextInt()
    val student = Student(name, english, math)
    student.print()
    student.nameCheck()
}