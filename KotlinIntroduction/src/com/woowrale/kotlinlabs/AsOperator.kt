package com.woowrale.kotlinlabs

class AsPerson(val firstName: String, val lastName: String){
    override fun equals(o: Any?): Boolean{
        val otherPerson = o as? AsPerson ?: return false
        return otherPerson.firstName == firstName && otherPerson.lastName == lastName
    }

    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}

fun main(args: Array<String>){
    val p1 = AsPerson("Demetrio", "Jeremias")
    val p2 = AsPerson("Demetrio", "Jeremias")

    println(p1 == p2)
    println(p1.equals(42))
}
