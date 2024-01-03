package com.neco.dagger.pattern_car

import com.neco.dagger.pattern_hero.Orc
import dagger.Component

@Component(modules = [HeroModule::class])
interface HeroComponent {

    fun inject(orc: Orc)

    fun getOrc() : Orc
}