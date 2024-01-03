package com.neco.dagger.pattern_car

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims() : Rims {
        return Rims()
    }

    @Provides
    fun providesTires() : Tires {
        return Tires()
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires) : Wheels {
        return Wheels(rims, tires)
    }
}