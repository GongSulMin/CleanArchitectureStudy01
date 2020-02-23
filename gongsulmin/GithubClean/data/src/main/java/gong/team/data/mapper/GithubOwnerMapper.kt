package gong.team.data.mapper

import gong.team.data.entity.GithubOwnerEntity
import gong.team.domain.entity.GithubOwnerModel
import javax.inject.Inject

class GithubOwnerMapper @Inject constructor()
    : BaseMapper<GithubOwnerEntity , GithubOwnerModel>{

    override fun mapFrom(from: GithubOwnerEntity): GithubOwnerModel {
        return GithubOwnerModel(
            from.login ,
            from.avatarUrl ,
            from.htmlUrl
        )
    }

}