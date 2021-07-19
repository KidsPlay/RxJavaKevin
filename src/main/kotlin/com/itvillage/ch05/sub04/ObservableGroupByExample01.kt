package com.itvillage.ch05.sub04

import com.itvillage.common.CarMaker
import com.itvillage.common.SampleData
import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.fromIterable(SampleData.carList)
        .groupBy { it.carMaker }
        .subscribe { groupedObservable ->
            groupedObservable.filter { it.carMaker == CarMaker.SSANGYOUNG }
                .subscribe {
                    Logger.log(LogType.ON_NEXT, it)
                }
        }
}