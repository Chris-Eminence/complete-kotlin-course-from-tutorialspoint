package com.example.consoleapp

class ConstructorClass(val firstName: String, val age: Int){

    fun consMethod(){
        val myVar = ConstructorClass("Emediong Christopher", 23)
        if (firstName == "Emediong Christopher"){
            println("you are welcome $firstName")
        }else{
            println("System Intruder")
        }
    }
}

fun main(){

    val obj = ConstructorClass("Emediong Christopher", 0)
    obj.consMethod()
//    val person1 = ConstructorClass("Henry", 49)//primary constructor
//    println("Example of a constructor")
//    println("firstName = ${person1.firstName}")
//    println("age = ${person1.age}")
}