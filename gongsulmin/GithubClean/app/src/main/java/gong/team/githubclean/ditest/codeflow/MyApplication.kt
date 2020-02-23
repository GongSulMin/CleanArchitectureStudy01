package gong.team.githubclean.ditest.codeflow

import android.app.Application
import gong.team.githubclean.ditest.codeflow.component.ActivityCarComponent
import gong.team.githubclean.ditest.codeflow.component.AppComponent

class MyApplication: Application() {

//    lateinit var component: ActivityCarComponent

//    lateinit var appComponent: AppComponent


    override fun onCreate() {
        super.onCreate()
//        component =
//            DaggerCarComponent
//                .builder()
//                .engineCapacity(10)
//                .horsePower(20)
//                .build()
    }
}