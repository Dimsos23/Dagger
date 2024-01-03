package com.neco.dagger.pattern_hero

import javax.inject.Inject


class NoWeaponBehavior @Inject constructor(): WeaponBehavior {

    private val damage = 3

    override fun attack() {
        println("Attack hands with $damage damage")
    }
}