package gong.team.githubclean.ditest.codeflow.stabucks

import gong.team.githubclean.ditest.Dagger
import gong.team.githubclean.ditest.codeflow.stabucks.component.StarbucksComponent
import javax.inject.Inject


fun main() {
//    Starbucks()
}

class Starbucks {

    @Inject
    lateinit var milk: Milk

    init {
//        DaggerStarbucksComponent.create().inject(this)
//        milk.makeMilk()

    }
}
