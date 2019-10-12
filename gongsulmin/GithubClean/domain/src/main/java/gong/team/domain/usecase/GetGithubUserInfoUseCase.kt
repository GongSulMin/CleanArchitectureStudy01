package gong.team.domain.usecase

import gong.team.domain.entity.GithubUserInfoEntity
import gong.team.domain.repository.GithubRepository
import io.reactivex.Single

/**
 *                          {
                                "scopes": ["repo"],
                                "note": "clean_app",
                                "client_id" : "" ,
                                "client_secret" : ""
                            }
 *
 *
 *
 */

class GetGithubUserInfoUseCase (
    private val repository: GithubRepository
) {
    operator fun invoke(): Single<GithubUserInfoEntity> {
        return repository.getUserInfo()
    }
}