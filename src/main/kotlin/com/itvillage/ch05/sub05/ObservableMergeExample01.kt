package com.itvillage.ch05.sub05

import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import com.itvillage.utils.TimeUtil
import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    Observable.merge(
        Observable.interval(200L, TimeUnit.MILLISECONDS).take(5),
        Observable.interval(400L, TimeUnit.MILLISECONDS).take(5).map { 1000 + it }
    ).subscribe {
        Logger.log(LogType.ON_NEXT, it)
    }

    TimeUtil.sleep(2500)
}