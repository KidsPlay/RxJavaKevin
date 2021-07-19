package com.itvillage.common

import java.util.*
import java.util.function.Predicate

object CarFilter {
    // 사용자 정의 Predicate 사용
    fun filterCarByCustomPredicate(cars: List<Car>, p: CarPredicate): List<Car> {
        val resultCars: MutableList<Car> = ArrayList()
        for (car in cars) if (p.test(car)) {
            resultCars.add(car)
        }
        return resultCars
    }

    // java.util.function 패키지에 내장된 Predicate 사용
    fun filterCarByBuiltinPredicate(cars: List<Car>, p: Predicate<Car?>): List<Car> {
        val resultCars: MutableList<Car> = ArrayList()
        for (car in cars) if (p.test(car)) {
            resultCars.add(car)
        }
        return resultCars
    }
}