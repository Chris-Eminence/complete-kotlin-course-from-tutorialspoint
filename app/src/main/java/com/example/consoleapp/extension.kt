package com.example.consoleapp

class Extension{
    var skills: String = "None"

    fun printSkill(){
        print(skills)
    }
}

fun main(){
    val handle = Extension()
    handle.skills = "Kotlin"

    val handl = Extension()
    handl.skills = "Flutter"

    val hand = Extension()
    hand.skills = handle.addMySkill(handl)
    hand.printSkill()
}
fun Extension.addMySkill(a:Extension):String{
    var han = Extension()
    han.skills = this.skills + " " + han.skills
    return han.skills
}