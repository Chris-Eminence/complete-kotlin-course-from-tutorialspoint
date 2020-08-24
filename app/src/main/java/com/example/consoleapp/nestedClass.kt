package com.example.consoleapp

class Outer{
    class Nested{
        fun foo() = "Welcome to a nested class"
    }
}

fun main(){
    val demo = Outer.Nested().foo()
    print (demo)
}