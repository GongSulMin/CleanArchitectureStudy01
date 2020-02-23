package gong.team.githubclean.ditest.codeflow.module

import dagger.Binds
import dagger.Module
import dagger.Provides
import gong.team.githubclean.ditest.codeflow.DieselEngine
import gong.team.githubclean.ditest.codeflow.Engine
import gong.team.githubclean.ditest.codeflow.PetrolEngine
import javax.inject.Named

@Module
abstract class BindsEngineModule  {
    @Binds
    abstract fun bindsDieselEngine(dieselEngine: DieselEngine): Engine
}

@Module
class DiselEngineOption(
    @Named("horsePower") val horsePower: Int
) {

    @Provides
    fun provideDieselEngine(): Engine {
        return DieselEngine(horsePower)
    }

    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }


//    @Named("horsePower")val horsePower: Int,
//    @Named("engineCapacity")val engineCapacity: Int
}