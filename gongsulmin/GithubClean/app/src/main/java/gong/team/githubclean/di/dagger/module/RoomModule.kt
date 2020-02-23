package gong.team.githubclean.di.dagger.module

import android.content.Context
import androidx.room.RoomDatabase
import dagger.Module
import dagger.Provides
import gong.team.data.datasource.local.database.LocalDataBase
import gong.team.data.datasource.local.database.LocalDataBaseImpl
import gong.team.data.datasource.local.database.TokenDao

@Module
class RoomModule {

    @Provides
    fun provideRoomDataBase(context: Context): LocalDataBase {
        return LocalDataBaseImpl.getInstance(context)!!
    }

    @Provides
    fun provideTokenDao(localDataBase: LocalDataBase): TokenDao {
        return localDataBase.TokenDao()
    }

}