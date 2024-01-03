package com.neco.dagger.pattern_hero

import javax.inject.Inject


class KnifeBehavior @Inject constructor(): WeaponBehavior {

    private val damage = 15

    override fun attack() {
        println("Attack knife with $damage damage")
    }
}