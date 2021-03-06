package gong.team.githubclean.di

import gong.team.domain.usecase.GetGithubFollowerUseCase
import gong.team.domain.usecase.GetGithubSearchListUsecase
import gong.team.domain.usecase.GetGithubUserInfoUseCase
import gong.team.domain.usecase.GetGithubUserTokenUseCase
import org.koin.dsl.module

val userCaseModule = module {
    single { GetGithubSearchListUsecase(get())}
    single { GetGithubUserTokenUseCase(get())}
    single { GetGithubUserInfoUseCase(get()) }
    single { GetGithubFollowerUseCase(get()) }
}