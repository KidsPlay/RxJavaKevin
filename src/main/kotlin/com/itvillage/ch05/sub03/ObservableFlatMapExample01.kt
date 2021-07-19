package com.itvillage.ch05.sub03

import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.just("hello")
        .flatMap { hello ->
            Observable.just("Java", "Kotlin", "Python")
                .map { lang -> "$hello, $lang" }
        }.subscribe {
            Logger.log(LogType.ON_NEXT, it)
        }
}