package com.woowrale.kotlinlabs

fun ignoreNulls(s: String?){
    val sNotNull: String = s!!
    println(sNotNull.length)
}

fun main(args: Array<String>) {
    ignoreNulls("abc")
    ignoreNulls(null)
}
