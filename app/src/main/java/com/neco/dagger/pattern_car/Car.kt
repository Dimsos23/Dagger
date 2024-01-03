package com.neco.dagger.pattern_car

import javax.inject.Inject

class Car @Inject constructor(val wheels: Wheels, val engine: Engine) {

    fun start() {
        engine.start()
        println("Driving....")
    }
}