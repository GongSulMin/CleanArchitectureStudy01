package gong.team.githubclean.ditest.codeflow.stabucks

import javax.inject.Inject

class Espresso @Inject constructor(
    water: Water ,
    coffeeBean: CoffeeBean
): Drink {

}