package com.itvillage.ch05.sub03

import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.range(1, 15)
        .filter { it % 2 == 0 }
        .map { it * it }
//        .subscribe { Logger.log(LogType.ON_NEXT, it) }

    //range,  filter, flatMap 구구단중 짝수단만 출력
    Observable.range(2, 8)
        .filter { it % 2 == 0 }
        .doOnNext { Logger.log("=============================================$it") }
        .flatMap { dan ->
            Observable.range(1, 9)
                .map { row ->
                    "$dan x $row = ${dan * row}"
                }
        }.subscribe {
            Logger.log(LogType.ON_NEXT, it)
        }

}