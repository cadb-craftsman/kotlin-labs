package com.woowrale.kotlinlabs

class Client(val name: String, val postalCode: Int){
    override fun toString() = "Client(name= $name, postalCode = $postalCode)"
}

fun main(args: Array<String>){
    val u1 = Client("Pedro", 123456)
    println(u1.toString())
}
