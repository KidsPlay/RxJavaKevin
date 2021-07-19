package com.itvillage

import io.reactivex.rxjava3.core.Observable

fun main() {
    val observable = Observable.just("Hello", "RxJava")
    observable.subscribe {
        println(it)
    }
}