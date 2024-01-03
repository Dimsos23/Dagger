package com.neco.dagger.pattern_car

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neco.dagger.R
import com.neco.dagger.pattern_hero.Human
import com.neco.dagger.pattern_hero.Orc
import com.neco.dagger.pattern_hero.ShadowBehavior
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var orc: Orc

    private lateinit var carComponent: CarComponent
//    private lateinit var heroComponent: HeroComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carComponent = DaggerCarComponent.create()
        carComponent.inject(this)

        car.start()

//        heroComponent = DaggerHeroComponent.create()
//        orc.sayRace()
//        orc.run()
//        orc.weaponBehavior.attack()
    }
}

fun main() {
    val human = Human()
    val orc = Orc()
    human.say()
    human.sayRace()
    human.weaponBehavior.attack()
    human.run()
    human.setWeapon(ShadowBehavior())
    human.weaponBehavior.attack()
    println()
    orc.sayRace()
    orc.weaponBehavior.attack()

}