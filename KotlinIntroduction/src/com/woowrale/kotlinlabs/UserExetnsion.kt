package com.woowrale.kotlinlabs

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave(){
    fun validate(value: String, fieldName: String){
        if(value.isEmpty()){
            throw IllegalArgumentException("Can't save user $id: empty field $fieldName")
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser(user: User){
    user.validateBeforeSave()
}

fun main(args: Array<String>) {
    val u1 = User(1, "Jhon", "House")
    saveUser(u1)
    val u2 = User(2, "Jhon", "")
    saveUser(u2)
    val u3 = User(3, "", "House")
    saveUser(u3)

}