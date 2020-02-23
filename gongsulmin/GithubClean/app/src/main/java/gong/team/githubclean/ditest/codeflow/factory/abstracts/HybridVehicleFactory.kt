package gong.team.githubclean.ditest.codeflow.factory.abstracts

class HybridVehicleFactory  {
    companion object {

        fun getHybrid(type: CarBodyType): HybridVehicle {
            return when(type) {
                CarBodyType.SEDAN -> HybridSedan()
                else -> HybridSedan()
            }

        }

    }
}