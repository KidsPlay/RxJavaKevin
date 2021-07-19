package com.itvillage.ch05.sub02

import com.itvillage.common.CarMaker
import com.itvillage.common.SampleData
import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import com.itvillage.utils.TimeUtil
import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    Observable.fromIterable(SampleData.carList)
        .filter { it.carMaker == CarMaker.SSANGYOUNG }
//        .subscribe { Logger.log(LogType.ON_NEXT, it.carName) }

    Observable.interval(1L, TimeUnit.SECONDS)
        .takeWhile { it < 10 }
//        .subscribe { Logger.log(LogType.ON_NEXT, it) }

    Observable.interval(1L, TimeUnit.SECONDS)
        .skipUntil(Observable.timer(3L, TimeUnit.SECONDS))
        .takeUntil { it == 10L }
//        .subscribe { Logger.log(LogType.ON_NEXT, it) }

    Observable.range(1, 15)
        .skipLast(3)
        .subscribe { Logger.log(LogType.ON_NEXT, it) }

    TimeUtil.sleep(12000)
}