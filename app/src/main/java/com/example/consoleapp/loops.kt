package com.example.consoleapp

fun main(args: Array<String>){
    println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n")
    val items = listOf(1,2,3)
    for (i in items)

        println("random message$i")

//    Following is another example of code,
//    where we are using some library function to
//    make our development work easier than ever before.

    println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n")

    val anotherItems = listOf(1, 3, 5)
    for((index, value) in  anotherItems.withIndex())
        print("the Element at $index is $value")


//    example of while loop

    println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n")
    var y: Int = 0
    println("example of while loop")
    while (y <= 10){
        println(y)
        y++
    }
    println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n")

    var a: Int = 0
    do{
        a += 10
        println("i am block--"+a)

    }while (a <= 80)
}