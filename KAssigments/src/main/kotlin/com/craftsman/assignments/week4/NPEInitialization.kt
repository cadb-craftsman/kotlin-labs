package com.craftsman.assignments.week4

open class AA(open val value: String) {
    init {
        value.length
    }
}

class B(value: String) : AA(value)

fun main(args: Array<String>) {
    val b = B("a")
    println(b.value)
}