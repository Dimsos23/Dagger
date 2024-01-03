package com.neco.dagger.pattern_hero

import javax.inject.Inject


class Orc @Inject constructor(): Hero(NoWeaponBehavior()) {

    override fun sayRace() {
        println("I'm Orc")
    }
}