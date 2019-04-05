package com.woowrale.kotlinlabs

import com.woowrale.kotlinlabs.model.Person

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false

    var p =Person("Juan", "Perez", 20)
    println(p.toString())
}

fun isValidIdentifier(s: String): Boolean {
    var isOk = false
    if(s.isNotEmpty()){
        val v = s.toIntOrNull()
        if(v == null){
            if(!s.contains("$")){
                isOk = true
            }
        }
    }
    return isOk
}
