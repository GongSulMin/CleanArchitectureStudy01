package gong.team.githubclean.ditest.codeflow.factory.method

import java.lang.IllegalArgumentException

class PastryFactory  {
    companion object {
        fun getPastry(pastryType: PastryType): Pastry {
            return when(pastryType) {
                PastryType.BAKLAVA -> Baklava()
                PastryType.CINNAMONROLL -> Cinnamonroll()
                PastryType.FLAKY -> Flaky()
                PastryType.PUFF -> Puff()
                else -> throw IllegalArgumentException("")
            }
        }
    }
}