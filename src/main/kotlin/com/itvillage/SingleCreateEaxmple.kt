package com.itvillage

import com.itvillage.utils.DateUtil
import com.itvillage.utils.LogType
import com.itvillage.utils.Logger
import io.reactivex.rxjava3.core.Single

fun main() {
    val single = Single.create<String> { emitter -> emitter.onSuccess(DateUtil.nowDate) }

    single.subscribe({ data ->
        Logger.log(LogType.ON_SUCCESS, data)
    }, { error ->
        Logger.log(LogType.ON_ERROR, error)
    })
}