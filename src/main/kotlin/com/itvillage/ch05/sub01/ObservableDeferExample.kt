package com.itvillage.ch05

import com.itvillage.utils.Logger
import com.itvillage.utils.TimeUtil
import io.reactivex.rxjava3.core.Observable
import java.time.LocalTime

fun main() {
    val defer = Observable.defer { Observable.just(LocalTime.now().toString()) }

    val just = Observable.just(LocalTime.now().toString())

    defer.subscribe { Logger.log("defer = $it") }
    just.subscribe { Logger.log("just = $it") }

    TimeUtil.sleep(3000)

    defer.subscribe { Logger.log("defer = $it") }
    just.subscribe { Logger.log("just = $it") }
}