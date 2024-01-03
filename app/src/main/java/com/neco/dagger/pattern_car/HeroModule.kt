package com.neco.dagger.pattern_car

import com.neco.dagger.pattern_hero.NoWeaponBehavior
import com.neco.dagger.pattern_hero.WeaponBehavior
import dagger.Module
import dagger.Provides

@Module
class HeroModule {

    @Provides
    fun provideHeroOrc(weaponBehavior : NoWeaponBehavior) : WeaponBehavior {
        return weaponBehavior
    }
}