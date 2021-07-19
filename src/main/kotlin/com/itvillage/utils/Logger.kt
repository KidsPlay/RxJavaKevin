package com.itvillage.utils

import com.itvillage.utils.TimeUtil.currentTimeFormatted

object Logger {
    fun log(msg: String) {
        val time = currentTimeFormatted
        println(msg + " | " + Thread.currentThread().name + " | " + time)
    }

    fun log(msg: String, obj: Any) {
        val time = currentTimeFormatted
        println(msg + " | " + Thread.currentThread().name + " | " + time + " | " + obj)
    }

    fun log(logType: LogType) {
        val time = currentTimeFormatted
        println(logType.logType + " | " + Thread.currentThread().name + " | " + time)
    }

    fun log(logType: LogType, obj: Any) {
        val time = currentTimeFormatted
        println(logType.logType + " | " + Thread.currentThread().name + " | " + time + " | " + obj)
    }
}