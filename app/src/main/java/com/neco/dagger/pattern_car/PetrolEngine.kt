package com.neco.dagger.pattern_car

import javax.inject.Inject

class PetrolEngine @Inject constructor(): Engine {

    override fun start() {
        println("Petrol Engine started")
    }
}