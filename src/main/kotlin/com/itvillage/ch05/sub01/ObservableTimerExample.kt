package com.itvillage.ch05

import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import com.itvillage.utils.TimeUtil
import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    println("# start : ${TimeUtil.currentTimeFormatted}")

    Observable.timer(2000L, TimeUnit.MILLISECONDS)
        .map { "doWork" }
        .subscribe { Logger.log(LogType.ON_COMPLETE, it) }

    TimeUtil.sleep(2500)
}