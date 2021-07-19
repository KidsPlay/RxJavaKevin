package com.itvillage.ch05.sub05

import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import com.itvillage.utils.TimeUtil
import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    val o1 = Observable.interval(500L, TimeUnit.MILLISECONDS)
        .take(4)
        .map { "o1 = $it" }

    val o2 = Observable.interval(300L, TimeUnit.MILLISECONDS)
        .take(5)
        .map { "o2 = ${1000 + it}" }

    Observable.concat(o1, o2)
        .subscribe { Logger.log(LogType.ON_NEXT, it) }

    TimeUtil.sleep(5000)
}