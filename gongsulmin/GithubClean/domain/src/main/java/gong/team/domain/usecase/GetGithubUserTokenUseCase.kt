package gong.team.domain.usecase

import gong.team.domain.entity.GithubTokenEntity
import gong.team.domain.service.ServiceRepository
import io.reactivex.Single
import javax.inject.Inject

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

class GetGithubUserTokenUseCase @Inject constructor(
    private val repository: ServiceRepository
) {
    operator fun invoke(header: String): Single<GithubTokenEntity> {
        return repository.getAccessToken(header)
    }
}