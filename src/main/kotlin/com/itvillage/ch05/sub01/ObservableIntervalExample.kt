package com.itvillage.ch05

import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import com.itvillage.utils.TimeUtil
import com.itvillage.utils.TimeUtil.currentTimeFormatted
import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    println("# start : $currentTimeFormatted")

    Observable.interval( 1000L, TimeUnit.MILLISECONDS)
        .map { "$it count" }
        .subscribe { Logger.log(LogType.ON_NEXT, it) }

    TimeUtil.sleep(3000)
}