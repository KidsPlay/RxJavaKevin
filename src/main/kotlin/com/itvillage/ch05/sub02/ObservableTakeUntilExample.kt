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
        .takeUntil { it.carMaker == CarMaker.SSANGYOUNG }
        .subscribe { Logger.log(LogType.ON_NEXT, it) }

    Observable.interval(1L, TimeUnit.SECONDS)
        .takeUntil(Observable.timer(5500L, TimeUnit.MILLISECONDS))
        .subscribe { Logger.log(LogType.ON_NEXT, it) }

    TimeUtil.sleep(6000)
}