package gong.team.githubclean.ditest.codeflow.module

import dagger.Module
import dagger.Provides
import gong.team.githubclean.ditest.codeflow.Driver
import javax.inject.Singleton

@Module
class DriverModule {

    @Provides
    @Singleton
    fun provideDriver(): Driver {
        return Driver()
    }

}