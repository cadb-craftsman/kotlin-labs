package com.woowrale.kotlinlabs

private data class Person(val name: String, val age: Int)

private fun findTheOldest(people: List<Person>): Person? {
    var maxAge = 0
    var theOldest: Person? = null
    for(p in people){
        if(p.age > maxAge){
            maxAge = p.age
            theOldest = p
        }
    }
    return theOldest
}

fun main(args: Array<String>) {
    val p1 = Person("Jose", 25)
    val p2 = Person("Juan", 30)
    val p3 = Person("Carlos", 40)
    val p4 = Person("Maria", 25)

    val people = listOf(p1, p2, p3, p4)
    val person = findTheOldest(people)
    println(person)

    println(people.groupBy { it.age })
}