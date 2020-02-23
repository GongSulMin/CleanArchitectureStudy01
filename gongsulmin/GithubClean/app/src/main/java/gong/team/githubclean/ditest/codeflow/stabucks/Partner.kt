package gong.team.githubclean.ditest.codeflow.stabucks

import javax.inject.Inject
import javax.inject.Named
import javax.inject.Provider
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import gong.team.githubclean.ditest.codeflow.stabucks.component.PartnerComponent

//@Inject constructor
class Partner (
//    val partnerComponent: PartnerComponent.Builder
){

    init {
//        partnerComponent.build().inject(this)
    }
    @Inject
    @Named("partnerId")
    lateinit var partnerId: String

    @Inject
    lateinit var menuMap: Map<Class<*> , Provider<Drink>>

    fun <T: Drink > makeDrink(t: Class<T> ): T {
        return menuMap.get(t)?.get() as T
    }

    fun getId(): String {
        return partnerId
    }


}