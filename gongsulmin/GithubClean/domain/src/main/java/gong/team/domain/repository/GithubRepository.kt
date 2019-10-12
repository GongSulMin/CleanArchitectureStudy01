package gong.team.domain.repository

import gong.team.domain.entity.GithubFollowEntity
import gong.team.domain.entity.GithubSearchResultModel
import gong.team.domain.entity.GithubTokenEntity
import gong.team.domain.entity.GithubUserInfoEntity
import io.reactivex.Single

interface GithubRepository {

    fun getGithubSearchResult(
        query: String ,
        page: String ,
        per_page: String
    ): Single<List<GithubSearchResultModel>>

    fun getAccessToken(
        header: String
    ): Single<GithubTokenEntity>

    fun getUserInfo(
    ): Single<GithubUserInfoEntity>

    fun getFollowUser(
        name: String ,
        isFollowing: Boolean
    ): Single<List<GithubFollowEntity>>

//
}
