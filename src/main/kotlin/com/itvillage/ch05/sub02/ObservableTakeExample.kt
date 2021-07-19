package com.itvillage.ch05.sub02

import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import com.itvillage.utils.TimeUtil
import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    Observable.just(1, 2, 3, 4, 5, 6)
        .take(4)
        .subscribe { Logger.log(LogType.ON_NEXT, it) }

    Observable.interval(500, TimeUnit.MILLISECONDS)
        .take(3, TimeUnit.SECONDS)
        .subscribe { Logger.log(LogType.ON_NEXT, it) }

    TimeUtil.sleep(4000)
}