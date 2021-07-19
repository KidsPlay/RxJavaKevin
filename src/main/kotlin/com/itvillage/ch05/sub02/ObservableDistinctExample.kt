package com.itvillage.ch05.sub02

import com.itvillage.common.SampleData
import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.fromIterable(SampleData.carList)
        .distinct { car -> car.carMaker }
        .subscribe { Logger.log(LogType.ON_NEXT, it.toString()) }
}