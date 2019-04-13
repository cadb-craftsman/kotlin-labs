package com.woowrale.kotlinlabs

class A{
    private lateinit var value: String

    fun setUp(){
        value = "value"
    }

    fun display(){
        println(value)
    }
}

fun main(args: Array<String>) {
    val a = A()
    a.setUp()
    a.display()
}