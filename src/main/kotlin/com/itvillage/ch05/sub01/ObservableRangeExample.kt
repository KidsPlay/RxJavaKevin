package com.itvillage.ch05

import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import com.itvillage.utils.TimeUtil
import io.reactivex.rxjava3.core.Observable

fun main() {
    println("# start : ${TimeUtil.currentTimeFormatted}")

    Observable.range(0, 15)
        .subscribe { Logger.log(LogType.ON_NEXT, it) }
}