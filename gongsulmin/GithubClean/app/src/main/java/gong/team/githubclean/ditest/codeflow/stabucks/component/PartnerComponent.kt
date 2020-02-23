package gong.team.githubclean.ditest.codeflow.stabucks.component

import android.os.Build
import dagger.Subcomponent
import gong.team.githubclean.ditest.codeflow.stabucks.Partner
import gong.team.githubclean.ditest.codeflow.stabucks.module.PartnerModule
import gong.team.githubclean.ditest.codeflow.stabucks.scope.PartnerScope


//@PartnerScope
//@Subcomponent(modules = [PartnerModule::class])
interface PartnerComponent {

//    @Subcomponent.Builder
//    interface  Builder {
//        fun build(): PartnerComponent
//        fun partnerModule(partnerModule: PartnerModule): Builder
//    }
//
    fun inject(partner: Partner)
}