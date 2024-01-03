package com.neco.dagger.pattern_hero

import javax.inject.Inject


class ShadowBehavior @Inject constructor(): WeaponBehavior {
    private val damage = 100

    override fun attack() {
        println("Attack with $damage damage")
    }

}