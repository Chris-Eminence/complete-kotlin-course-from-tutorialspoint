package com.example.consoleapp

data class Details(val name: String, val number: Long, val age: Int)

fun main(){
    val info: Details = Details ("Christopher", 9, 20)
    println("Name of the code writer--"+info.name)
    println("Number of the code writer--"+info.number)
    println("Age of the code writer--"+info.age)

    println("Printing all of them together--${info.toString()}")
    println("Example of hashcode function--"+info.hashCode())

}