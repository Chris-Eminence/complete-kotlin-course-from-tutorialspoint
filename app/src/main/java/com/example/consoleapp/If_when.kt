package com.example.consoleapp

class MyWhenClass{
fun whenMethod(){
    val variableName: Int = 4
    when (variableName){
        1 -> print("You have picked the index number one")
        2 -> print("You have picked the index number two")
        4 -> print("You have picked the index number four")

    else -> {
        println("System can't identify what you are looking for")
    }
    }
}
}

fun main(){
    val obj = MyWhenClass()
    obj.whenMethod()
}