package com.example.consoleapp

class NewClass{
    private var classVariable = "first class of the decade"

    fun printClass(){
        println("This is the $classVariable")
    }
}
fun main(args: Array<String>) {
    val obj = NewClass()
    obj.printClass()
}