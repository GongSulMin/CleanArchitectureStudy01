package gong.team.githubclean.di.dagger.module

import dagger.Binds
import dagger.Module
import gong.team.data.entity.GithubOwnerEntity
import gong.team.data.entity.GithubSearchItemEntity
import gong.team.data.mapper.BaseMapper
import gong.team.data.mapper.GithubOwnerMapper
import gong.team.data.mapper.GithubSearchItemMapper
import gong.team.domain.entity.GithubOwnerModel
import gong.team.domain.entity.GithubSearchResultModel

@Module
abstract class MapperModule {

    @Binds
    abstract fun provideGithubSearchItemMapper(
        githubSearchItemModel: GithubSearchItemMapper
    ): BaseMapper<GithubSearchItemEntity, GithubSearchResultModel>

    @Binds
    abstract fun provideGithubOwnerMapper(
        githubOwnerMapper: GithubOwnerMapper
    ):BaseMapper<GithubOwnerEntity , GithubOwnerModel>

}