package com.itvillage.ch05

import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import io.reactivex.rxjava3.core.Observable

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    Observable.fromIterable(list)
        .subscribe { Logger.log(LogType.ON_NEXT, it) }
}