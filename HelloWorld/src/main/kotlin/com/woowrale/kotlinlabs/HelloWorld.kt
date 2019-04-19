package com.woowrale.kotlinlabs

import com.woowrale.kotlinlabs.model.Person

fun main(args: Array<String>) {
    println("HelloWorld Kotlin")
    val p = Person("Juan", "Perez", "Man", 26)
    println(p.toString())

    var name = if(args.size > 0) args[0] else "Kotlin"
    println("Hello $name")
}