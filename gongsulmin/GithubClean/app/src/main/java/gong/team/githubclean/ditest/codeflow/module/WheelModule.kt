package gong.team.githubclean.ditest.codeflow.module

import dagger.Module
import dagger.Provides
import gong.team.githubclean.ditest.codeflow.Rims
import gong.team.githubclean.ditest.codeflow.Tires
import gong.team.githubclean.ditest.codeflow.Wheel

@Module
class WheelModule  {

    @Provides
    fun provideTires() = Tires()

    @Provides
    fun provideRims() = Rims()

    @Provides
    fun provideWheel(tires: Tires , rims: Rims): Wheel {
        return Wheel(tires , rims)
    }
}