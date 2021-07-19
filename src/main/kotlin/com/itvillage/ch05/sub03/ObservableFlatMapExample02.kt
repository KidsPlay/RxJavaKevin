package com.itvillage.ch05.sub03

import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.range(2, 8)
        .flatMap { dan ->
            Observable.range(1, 9)
                .map { row ->
                    "$dan x $row = ${dan * row}"
                }
        }.subscribe {
            Logger.log(LogType.ON_NEXT, it)
        }
}