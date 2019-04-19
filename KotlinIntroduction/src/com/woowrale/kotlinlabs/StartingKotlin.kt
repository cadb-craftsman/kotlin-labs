package com.woowrale.kotlinlabs

import java.lang.StringBuilder

fun main(args: Array<String>) {
    println(recognize('f'))
    println(recognize('2'))
    println(recognize(';'))

    val list = listOf(1,2,3)
    println(list.joinToString(separator = "; ", prefix = "(", postfix = ")"))
}

fun recognize(c: Char) = when (c){
    in '0' .. '9' -> "It's a digit"
    in 'a' .. 'z', in 'A'..'Z' -> "It's a letter"
    else -> "I don't know"
}

fun <T> Collection<T>.joinToString(separator: String, prefix: String, postfix: String): String{
    val result = StringBuilder(prefix)

    for((index, element) in this.withIndex()){
        if(index > 0) {
            result.append(separator)
        }
        result.append(element)

    }
    result.append(postfix)
    return  result.toString()
}