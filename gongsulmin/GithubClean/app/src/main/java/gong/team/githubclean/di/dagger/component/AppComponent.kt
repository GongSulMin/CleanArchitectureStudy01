package gong.team.githubclean.di.dagger.component

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import gong.team.githubclean.di.dagger.module.*
import gong.team.githubclean.ui.login.LoginActivity

@Component(modules = [
    DataSourceModule::class ,
    MapperModule::class ,
    NetworkModule::class ,
    RepositoryModule::class ,
    RoomModule::class]
)
interface AppComponent {

    fun inject(loginActivity: LoginActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun getContext(context: Context):Builder

        fun build(): AppComponent
    }

}