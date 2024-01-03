package com.neco.dagger.pattern_car

import javax.inject.Inject

class DieselEngine @Inject constructor(): Engine {

    override fun start() {
        println("Diesel engine started")
    }

}