package com.itvillage.utils

object NumberUtil {
    fun randomRange(min: Int, max: Int): Int {
        return (Math.random() * (max - min + 1)).toInt() + min
    }
}