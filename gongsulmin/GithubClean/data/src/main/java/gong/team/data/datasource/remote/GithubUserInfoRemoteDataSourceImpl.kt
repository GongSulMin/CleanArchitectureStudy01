package gong.team.data.datasource.remote

import gong.team.data.GithubApi
import gong.team.data.request.GithubTokenRequest
import gong.team.data.response.GithubFollowUserResponse
import gong.team.data.response.GithubTokenResponse
import gong.team.data.response.GithubUserReposReponse
import gong.team.data.response.GithubUserResponse
import io.reactivex.Single
import javax.inject.Inject

class GithubUserInfoRemoteDataSourceImpl @Inject constructor(
    val githubApi: GithubApi
)
    : GithubUserInfoRemoteDataSource  {

    override fun getFollowUser(
        name: String,
        isFollowing: Boolean
    ): Single<List<GithubFollowUserResponse>> {
        return if (isFollowing) {
            githubApi.getGithubFollowerUser(name)
        }else {
            githubApi.getGithubFollowingUser(name)
        }
    }

    override fun getUserRepos(token: String): Single<List<GithubUserReposReponse>> {
        return githubApi.getGithubUserRepos(
            token.toToken()
        )
    }

    override fun getAccessToken(header: String): Single<GithubTokenResponse> {
        val tokenRequest =
            GithubTokenRequest(
                clientId = "95afcb4b4c096edece62" ,
                clientSecret = "59154278e48eb51d32ac6b735fb072b32ccd2418" ,
                note = "clean_app" ,
                scopes = listOf("repo")
            )
        return githubApi.getGithubToken(header , tokenRequest)
    }

    override fun getUserInfo(token: String): Single<GithubUserResponse> {
         return githubApi.getGithubUser(
             token.toToken()
            )
    }

    fun String.toToken() = "token $this"

}