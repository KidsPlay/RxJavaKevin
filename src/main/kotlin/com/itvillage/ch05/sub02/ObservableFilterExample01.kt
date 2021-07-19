package com.itvillage.ch05.sub02

import com.itvillage.common.CarMaker
import com.itvillage.common.SampleData
import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.fromIterable(SampleData.carList)
        .filter { car ->
            car.carMaker == CarMaker.CHEVROLET
        }.subscribe { car ->
            Logger.log(LogType.ON_NEXT, "${car.carName} / ${car.carMaker}")
        }
}