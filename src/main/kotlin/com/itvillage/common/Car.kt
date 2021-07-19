package com.itvillage.common

class Car {
    var carMaker: CarMaker? = null
    var carType: CarType? = null
    var carName: String
    var carPrice = 0
    var isNew = false

    constructor(carName: String) {
        this.carName = carName
    }

    constructor(carName: String, carType: CarType?) {
        this.carName = carName
        this.carType = carType
    }

    constructor(carMaker: CarMaker?, carName: String, carType: CarType?, carPrice: Int) {
        this.carMaker = carMaker
        this.carName = carName
        this.carType = carType
        this.carPrice = carPrice
    }

    constructor(carMaker: CarMaker?, carType: CarType?, carName: String, carPrice: Int, isNew: Boolean) {
        this.carMaker = carMaker
        this.carType = carType
        this.carName = carName
        this.carPrice = carPrice
        this.isNew = isNew
    }

    override fun toString(): String {
        return "Car(carMaker=$carMaker, carType=$carType, carName='$carName', carPrice=$carPrice, isNew=$isNew)"
    }


}