package gong.team.githubclean.ditest.codeflow.stabucks

import javax.inject.Inject

class Latte @Inject constructor(
    espresso: Espresso ,
    milk: Milk
): Drink {
}