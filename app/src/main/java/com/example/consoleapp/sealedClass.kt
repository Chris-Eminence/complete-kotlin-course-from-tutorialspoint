package com.example.consoleapp

sealed class MySealedClass{
    object OP1 : MySealedClass()
    object OP2 : MySealedClass()



}


fun main(){
    val obj: MySealedClass = MySealedClass.OP1
    val output = when (obj){//defining the object of the class depending on the inputs
        is MySealedClass.OP1 -> "option one has been choosen"
        is MySealedClass.OP2 -> "option two has been choosen"

    }
    print(output)
}