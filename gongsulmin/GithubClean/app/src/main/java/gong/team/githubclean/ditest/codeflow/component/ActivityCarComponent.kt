package gong.team.githubclean.ditest.codeflow.component

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import gong.team.githubclean.ditest.codeflow.Car
import gong.team.githubclean.ditest.codeflow.CodeFlowDaggerActivity
import gong.team.githubclean.ditest.codeflow.module.BindsEngineModule
import gong.team.githubclean.ditest.codeflow.module.DiselEngineOption
import gong.team.githubclean.ditest.codeflow.module.WheelModule
import gong.team.githubclean.ditest.codeflow.scope.PerActivity
import javax.inject.Named
import javax.inject.Singleton

//@PerActivity
//@Component(dependencies = [AppComponent::class] ,  modules = [WheelModule::class  , BindsEngineModule::class])
//@Subcomponent(modules = [WheelModule::class  , BindsEngineModule::class , DiselEngineOption::class])
interface ActivityCarComponent {

//    fun inject(codeFlowDaggerActivity: CodeFlowDaggerActivity)
    fun getCar(): Car

//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        fun horsePower(@Named("horsePower")horsePower: Int):Builder
//        @BindsInstance
//        fun engineCapacity(@Named("engineCapacity")engineCapacity: Int): Builder
//
//        fun build(appComponent: AppComponent): Builder
//        fun build(): ActivityCarComponent
//    }

}