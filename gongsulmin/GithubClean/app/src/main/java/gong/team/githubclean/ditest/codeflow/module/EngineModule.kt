package gong.team.githubclean.ditest.codeflow.module

import dagger.Module
import dagger.Provides
import gong.team.githubclean.ditest.codeflow.Engine
import gong.team.githubclean.ditest.codeflow.PetrolEngine

@Module
class EngineModule constructor(
    val horsePower: Int
) {

//    @Provides
//    fun provideHorsePower(): Int {
//        return horsePower
//    }

//    @Provides
//    fun providePetrolEngine(): Engine{
//        return PetrolEngine(horsePower)
//    }

}