package com.itvillage

import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import io.reactivex.rxjava3.core.BackpressureStrategy
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.FlowableEmitter
import io.reactivex.rxjava3.core.FlowableOnSubscribe
import io.reactivex.rxjava3.schedulers.Schedulers
import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription

fun main() {
    val flowable = Flowable.create(FlowableOnSubscribe<String> { emitter ->
        val datas = arrayOf("Hello", "RxJava")

        for (s in datas) {
            emitter.onNext(s)
        }

        emitter.onComplete()
    }, BackpressureStrategy.BUFFER)

    flowable.observeOn(Schedulers.computation())
    flowable.subscribe({
        Logger.log(LogType.ON_NEXT, it)
    }, {
        Logger.log(LogType.ON_ERROR, it)
    }, {
        Logger.log(LogType.ON_COMPLETE)
    })
}