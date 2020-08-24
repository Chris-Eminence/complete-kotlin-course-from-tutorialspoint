package com.example.consoleapp

fun main(){
    val objectOne = GenericsExample<String>("message")
    val objectTwo = GenericsExample<Int>(10)

    print(objectOne)
    print(objectTwo)

}
class GenericsExample<T>(gra: T){
    init {
        print(" This method is being called $gra")
    }
}