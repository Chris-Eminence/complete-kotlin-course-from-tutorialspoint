package com.example.consoleapp

open class MotherClass{
   open fun mother(){
        println("mother gives me two lands and 1 million dollR")

    }
}

open class ChildClass : MotherClass(){
//    to override a method in the super class
    override fun mother(){
}

    fun child(){
        println("This is the child of the mother")

    }
}


fun main(){
    val b = ChildClass()
    b.mother()
    b.child()

}