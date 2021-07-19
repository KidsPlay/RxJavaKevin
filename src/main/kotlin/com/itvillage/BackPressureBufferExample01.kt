package com.itvillage

import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import com.itvillage.utils.TimeUtil
import io.reactivex.rxjava3.core.BackpressureOverflowStrategy
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

fun main() {

    println("# start ${TimeUtil.currentTimeFormatted}")
    Flowable.interval(300L, TimeUnit.MILLISECONDS)
        .doOnNext { data -> Logger.log("#interval doOnNext()", data) }
        .onBackpressureLatest()
//        .onBackpressureBuffer(
//            2,
//            { Logger.log("overflow!") },
//            BackpressureOverflowStrategy.DROP_LATEST
//        )
        .doOnNext { data -> Logger.log("#onBackPressureBuffer doOnNext()", data) }
        .observeOn(Schedulers.computation(), false, 1)
        .subscribe(
            { data ->
                TimeUtil.sleep(1000)
                Logger.log(LogType.ON_NEXT, data)
            },
            { error -> Logger.log(LogType.ON_ERROR, error) }
        )

    TimeUtil.sleep(4000)

}