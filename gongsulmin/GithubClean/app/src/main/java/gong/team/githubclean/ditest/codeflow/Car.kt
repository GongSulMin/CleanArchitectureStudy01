package gong.team.githubclean.ditest.codeflow

import gong.team.githubclean.ditest.codeflow.scope.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(
    val engine: Engine ,
    val wheel: Wheel ,
    val driver: Driver
){

    fun drive() {
        engine.start()
        println(" Car drive   ${driver}")
    }
}