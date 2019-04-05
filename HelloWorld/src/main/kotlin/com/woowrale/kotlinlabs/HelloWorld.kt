package com.woowrale.kotlinlabs

import com.woowrale.kotlinlabs.model.Person

fun main(args: Array<String>) {
    println("HelloWorld Kotlin")
    val p = Person("Juan", "Perez", "Man", 26)
    println(p.toString())
}