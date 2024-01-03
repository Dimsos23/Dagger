package com.neco.dagger.pattern_car

import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun providePetrolEngine(engine: PetrolEngine) : Engine
}