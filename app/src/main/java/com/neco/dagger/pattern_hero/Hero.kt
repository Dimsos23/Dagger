package com.neco.dagger.pattern_hero


abstract class Hero (var weaponBehavior : WeaponBehavior) {

    fun setWeapon(weaponBehavior: WeaponBehavior) {
        this.weaponBehavior = weaponBehavior
        println("Change weapon...")
    }

    abstract fun sayRace()

    fun say() {
        println("I'm Hero")
    }
    fun run() {
        println("Running....")
    }

}