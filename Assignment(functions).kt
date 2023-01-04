package com.example.firstapplication

fun main(){
    calculate(First= 5.5, Second = 10.5, Third = "-")
}

fun calculate(First : Double , Second:Double , Third : String = "+" ) {
when(Third){
    "+" -> println("Valid Arguments " + (First+Second))
    "-" -> println("Valid Arguments " + (First-Second))
    "*" -> println("Valid Arguments " + (First*Second))
    "/" -> println("Valid Arguments " + (First/Second))
    else-> println("Invalid Arguments ")
}
}