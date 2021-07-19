package com.itvillage.common

interface CarPredicate {
    fun test(car: Car?): Boolean
}