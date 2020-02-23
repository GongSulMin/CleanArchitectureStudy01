package gong.team.githubclean.di.dagger.module

import dagger.Binds
import dagger.Module
import gong.team.data.repository.GithubRepositoryImpl
import gong.team.domain.repository.GithubRepository
import gong.team.domain.service.ServiceRepository
import gong.team.domain.service.ServiceRepositoryImpl

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepositoryImpl(repositoryImpl: GithubRepositoryImpl): GithubRepository

    @Binds
    abstract fun provideServiceRepositoryImpl(serviceRepositoryImpl: ServiceRepositoryImpl): ServiceRepository
}
