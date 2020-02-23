package gong.team.githubclean.ditest.codeflow

import javax.inject.Inject

class Wheel constructor(
    val tires: Tires ,
    val rims: Rims
)  {

}

class Tires {

    constructor() {
        println("Tires")
    }
}

class Rims {

}