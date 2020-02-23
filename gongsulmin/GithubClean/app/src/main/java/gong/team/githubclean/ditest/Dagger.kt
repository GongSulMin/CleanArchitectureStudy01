package gong.team.githubclean.ditest

import dagger.Module
import dagger.Provides
import javax.inject.Inject

class Dagger {
}

class AA {

}

class BB(
    val aa: AA
) {
}

class CC @Inject constructor(
    val aa: AA ,
    val bb: BB
)

@Module
class Amodule {

    @Provides
    fun provideAModule(): AA {
        return AA()
    }
}

@Module
class Bmodule{

    @Provides
    fun provideBModule(a: AA): BB {
        return BB(a)
    }
}