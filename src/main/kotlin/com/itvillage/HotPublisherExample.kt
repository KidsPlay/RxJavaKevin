package com.itvillage

import io.reactivex.rxjava3.processors.PublishProcessor

fun main() {
    val processor = PublishProcessor.create<Int>()

    processor.subscribe { println("구독자1 = $it") }
    processor.onNext(1)
    processor.onNext(3)

    processor.subscribe { println("구독자2 = $it") }
    processor.onNext(5)
    processor.onNext(7)

    processor.onComplete()
}