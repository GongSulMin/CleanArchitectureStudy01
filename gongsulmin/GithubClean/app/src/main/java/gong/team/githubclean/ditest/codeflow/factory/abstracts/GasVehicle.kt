package gong.team.githubclean.ditest.codeflow.factory.abstracts

class GasVehicle(
    val carBodyType: CarBodyType
): Vehicle {
    override fun drive() {

        println("drive energy ${carBodyType}")

    }

    override fun fillUp() {

        println("fillUp energy ${carBodyType}")


    }

    override fun greetDriver() {

        println("greetDriver energy ${carBodyType}")

    }

}