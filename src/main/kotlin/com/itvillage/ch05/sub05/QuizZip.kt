package com.itvillage.ch05.sub05

import com.itvillage.common.SampleData
import com.itvillage.utils.LogType
import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.zip(
        Observable.range(1, 12),
        Observable.fromIterable(SampleData.salesOfBranchA),
        Observable.fromIterable(SampleData.salesOfBranchB),
        Observable.fromIterable(SampleData.salesOfBranchC),
        { i, a, b, c -> "${i}월 매출 = ${a + b + c}" }
    ).subscribe {
        com.itvillage.utils.Logger.log(LogType.ON_NEXT, it)
    }
}