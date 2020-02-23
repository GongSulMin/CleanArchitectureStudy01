package gong.team.githubclean.ditest.codeflow

import javax.inject.Inject
import javax.inject.Named

interface Engine {

    fun start()

}

class PetrolEngine @Inject constructor(val horsePower: Int) : Engine {

    override fun start() {
        println("Petrol engine start  ${horsePower}")
    }

}

class DieselEngine @Inject constructor(
    @Named("horsePower")val horsePower: Int
//    @Named("engineCapacity")val engineCapacity: Int
) : Engine {

    override fun start() {
        println("Diesel engine start  $horsePower  ")
    }

}

class Block {

}

class Cylinders {

}

class SparkPlugs {

}
