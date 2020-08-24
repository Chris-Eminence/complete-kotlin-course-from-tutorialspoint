package com.example.consoleapp

fun main(){

    try {
        val myVariable: Int = 12
        val variable: String = "Welcome to my snippet"
        variable.toInt()
    }catch (e: Exception){
        e.printStackTrace()
    }finally {
        println("Exception handling")
    }
}