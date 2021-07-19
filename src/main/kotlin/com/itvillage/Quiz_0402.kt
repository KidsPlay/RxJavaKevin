package com.itvillage

import com.itvillage.common.Car
import com.itvillage.common.CarType

fun main() {
    val p: (String) -> Boolean = String::isEmpty

    val f: (Int) -> String = Int::toString

    val bp: (List<Int>, Int) -> Boolean = List<Int>::contains

    val c: (String) -> Unit = System.out::println

    val bf: (String, CarType) -> Car = { s, type -> Car(s, type) }

    println("empty test = ${p("aa")}")

    c("bp = ${bp(listOf(1, 2, 3), 1)}")
    c("bp = ${bp(listOf(1, 2, 3), 10)}")

    println("toString test ${f(123)}")
    println("toString test ${f(456)}")

    c(f(1234))
    c("test")

}