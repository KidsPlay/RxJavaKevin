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
    val flowable = Flowable.create(object : FlowableOnSubscribe<String> {
        override fun subscribe(emitter: FlowableEmitter<String>) {
            val datas = arrayOf("Hello", "RxJava")

            for (s in datas) {
                emitter.onNext(s)
            }

            emitter.onComplete()
        }
    }, BackpressureStrategy.BUFFER)

    flowable.observeOn(Schedulers.computation())
    flowable.subscribe(object : Subscriber<String> {
        override fun onSubscribe(s: Subscription?) {
            Logger.log(LogType.ON_SUBSCRIBE)
            s?.request(Long.MAX_VALUE)
        }

        override fun onNext(t: String) {
            Logger.log(LogType.ON_NEXT, t)
        }

        override fun onError(t: Throwable) {
            Logger.log(LogType.ON_ERROR, t)
        }

        override fun onComplete() {
            Logger.log(LogType.ON_COMPLETE)
        }
    })
}