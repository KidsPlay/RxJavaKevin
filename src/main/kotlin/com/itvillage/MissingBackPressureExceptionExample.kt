package com.itvillage

import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

fun main() {
    Flowable.interval(1, TimeUnit.MILLISECONDS)
        .doOnNext { println("doOnNext = $it") }
        .observeOn(Schedulers.computation())
        .subscribe({ data ->
            println("소비자 처리 대기중...")
            Thread.sleep(1000)
            println(data)

        },
            { error -> println(error) },
            { println("onComplete") })

    Thread.sleep(2000)
}