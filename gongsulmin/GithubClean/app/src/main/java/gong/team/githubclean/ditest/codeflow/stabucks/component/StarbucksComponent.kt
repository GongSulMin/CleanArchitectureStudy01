package gong.team.githubclean.ditest.codeflow.stabucks.component

import dagger.Component
import gong.team.githubclean.ditest.codeflow.stabucks.Milk
import gong.team.githubclean.ditest.codeflow.stabucks.Starbucks
import gong.team.githubclean.ditest.codeflow.stabucks.module.IngredientsModule
import javax.inject.Singleton

//@Singleton
//@Component(modules = [IngredientsModule::class])
interface StarbucksComponent {

    fun inject(starbucks: Starbucks)

//    @Component.Builder
//    interface Builder {
//
//    }

}