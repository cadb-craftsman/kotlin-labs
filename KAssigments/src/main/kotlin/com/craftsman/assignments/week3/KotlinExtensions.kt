package com.craftsman.assignments.week3

fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    val s3 = "   "

    println(s1.validate())
    println(s2.validate())
    println(s3.validate())
}

fun String?.validate(): Boolean{
    var isOk = false
    if (this.isNullOrEmpty()) {
        isOk = true
    }
    return isOk
}
