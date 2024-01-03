package com.neco.dagger.pattern_car

import dagger.Component

@Component(modules = [PetrolEngineModule::class, WheelsModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

}