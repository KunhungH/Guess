package com.example.guess

import java.util.Random

class SecretNumber {
    var secret = Random().nextInt(10)+1
    var count =0

    fun validate(number:Int) : Int{
        count++
        return number - secret
    }
}

fun main(){
    val sn = SecretNumber()
    println(sn.secret)
    println("${sn.validate(3)} , count: ${sn.count}")
}
