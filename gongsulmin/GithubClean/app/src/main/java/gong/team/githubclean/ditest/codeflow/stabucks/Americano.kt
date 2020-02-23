package gong.team.githubclean.ditest.codeflow.stabucks

import javax.inject.Inject

class Americano @Inject constructor(
    water: Water ,
    espresso: Espresso
): Drink {

}