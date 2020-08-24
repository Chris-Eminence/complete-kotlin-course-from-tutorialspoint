package com.example.consoleapp

fun main (args: Array<String>) {

    val int: Int = 1000
    val double: Double = 100.00
    val float: Float = 1000.00f
    val long: Long = 546458902983
    val byte: Byte = 78
    val short: Short = 1

    val letter: Char
    letter = 'a'
    println(letter)
    println("Hello Kotlin")
    println("Your Int value is $int");
    println("Your Double value is "+double);
    println("Your Int value is "+float);
    println("Your Int value is "+long);
    println("Your Int value is "+byte);
    println("Your Int value is "+short);

    var raeString: String = "I am a crazy string"
    val exString: String = "i am an E string"

    println("sweet $raeString")
    println("bitter $exString")

    //Working with arrays in Kotlin

    val arrayNumbers: IntArray = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7)
    println("your lucky number is "+arrayNumbers[3])

    //collections




}