package gong.team.githubclean.ditest.codeflow.component

import dagger.Component
import gong.team.githubclean.ditest.codeflow.Driver
import gong.team.githubclean.ditest.codeflow.module.BindsEngineModule
import gong.team.githubclean.ditest.codeflow.module.DriverModule
import javax.inject.Singleton

//@Singleton
//@Component(modules = [DriverModule::class ])
interface AppComponent {

    fun getActivityComponent(): ActivityCarComponent

//    fun getDriver(): Driver
}