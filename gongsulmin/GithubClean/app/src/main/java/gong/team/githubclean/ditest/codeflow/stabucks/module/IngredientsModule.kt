package gong.team.githubclean.ditest.codeflow.stabucks.module

import dagger.Module
import dagger.Provides
import gong.team.githubclean.ditest.codeflow.stabucks.CoffeeBean
import gong.team.githubclean.ditest.codeflow.stabucks.Milk
import gong.team.githubclean.ditest.codeflow.stabucks.Water

@Module
class IngredientsModule {

    @Provides
    fun provideCoffeeBean(): CoffeeBean {
        return CoffeeBean()
    }

    @Provides
    fun provideMilk(): Milk {
        return Milk()
    }

    @Provides
    fun provideWater(): Water {
        return Water()
    }
}