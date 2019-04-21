package com.woowrale.kotlinlabs

fun strLenSafe(s: String?): Int? = s?.length ?: 0

fun main(args: Array<String>){
    println(strLenSafe("abc"))
    println(strLenSafe(null))

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val company = Company("Jetbrains", address)
    val persona = Persona("Dimirty", company)

    printShippingLabel(persona)
    printShippingLabel(Persona("Alexey", null))

}

class Address(val streethAddress: String, val zipCode: Int, val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Persona(val name: String, val company: Company?)

fun printShippingLabel(persona: Persona){
    val address = persona.company?.address?: throw IllegalArgumentException("No address")
    with(address){
        println(streethAddress)
        println("$zipCode $city, $country")
    }
}