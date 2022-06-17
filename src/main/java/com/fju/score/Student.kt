package com.fju.com.fju.score

class Student(var name:String, var english:Int, var math:Int) {
    init {
//        println("Testing")
    }
    fun print() {
        println("$name\t$english\t$math\t${getAverage()}")
    }
//    fun getAverage() : Int {
//        return (english+math)/2
    fun getAverage() = (english+math)/2
}

fun main() {
    val stu = Student("Jack", 77, 51)
    stu.print()
//    println(stu.name +"\t"+ stu.english +"\t"+ stu.math)
}