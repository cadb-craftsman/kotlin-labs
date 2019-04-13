package com.woowrale.kotlinlabs

fun main(args: Array<String>) {
    var s: Int? = null
    println(s as? Int)
    println(s as Int?)    // exception
}