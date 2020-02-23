package gong.team.githubclean.di.dagger.module

import dagger.Binds
import dagger.Module
import gong.team.data.datasource.local.GithubUserLocalDataSource
import gong.team.data.datasource.local.GithubUserLocalDataSourceImpl
import gong.team.data.datasource.remote.GithubSearchRemoteDataSource
import gong.team.data.datasource.remote.GithubSearchRemoteDatasourceImpl
import gong.team.data.datasource.remote.GithubUserInfoRemoteDataSource
import gong.team.data.datasource.remote.GithubUserInfoRemoteDataSourceImpl


@Module
abstract class DataSourceModule {

    @Binds
    abstract fun provideLocalDataSource(
        githubUserLocalDataSourceImpl: GithubUserLocalDataSourceImpl
    ): GithubUserLocalDataSource

    @Binds
    abstract fun provideRemoteDataSource(
        githubUserInfoRemoteDataSourceImpl: GithubUserInfoRemoteDataSourceImpl
    ): GithubUserInfoRemoteDataSource

    @Binds
    abstract fun provideSearchRemoteDataSource(
        githubSearchRemoteDataSourceImpl: GithubSearchRemoteDatasourceImpl
    ): GithubSearchRemoteDataSource

}