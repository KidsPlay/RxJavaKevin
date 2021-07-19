package com.itvillage.ch05.sub04

import com.itvillage.common.CarMaker
import com.itvillage.common.SampleData
import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.fromIterable(SampleData.carList)
        .toMap({ it.carMaker }, { it.carName })
        .subscribe { map ->
            Logger.log(LogType.ON_NEXT, map)
        }
}