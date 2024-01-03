package com.neco.dagger.pattern_hero

import javax.inject.Inject


class Human @Inject constructor(): Hero(weaponBehavior = KnifeBehavior()) {

    private val race = "Human"

    override fun sayRace() {
        println("I'm $race")
    }

}