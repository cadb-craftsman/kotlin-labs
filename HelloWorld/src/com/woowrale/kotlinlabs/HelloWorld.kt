package com.woowrale.kotlinlabs

import com.woowrale.kotlinlabs.data.Person

fun main(args: Array<String>){
    val p = readPerson()
    displaySeparator('#', 5)
    println("HelloWorld Kotlin " + p.name)
}

fun readPerson(): Person{
    return Person("Juan", "Perez", 35)
}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}