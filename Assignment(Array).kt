package com.example.firstapplication

fun main() {

    var array = arrayListOf<Double>(10.5,15.6,20.9,19.1,25.5)
    var sum = 0.0
    for (i in array) {
        sum=sum+i
    }
    var average= sum / array.size
    print(average)
}