package gong.team.githubclean.ditest.codeflow.factory.abstracts

abstract class HybridVehicle constructor(
    val carBodyType: CarBodyType
): Vehicle {

    override fun drive() {

        println("drive $carBodyType")

    }

    override fun fillUp() {

        println("fillUp $carBodyType")

    }

    override fun greetDriver() {

        println("greetDriver $carBodyType")

    }


}