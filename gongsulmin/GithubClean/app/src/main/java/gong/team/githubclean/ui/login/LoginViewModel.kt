package gong.team.githubclean.ui.login

import android.util.Base64
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import gong.team.domain.usecase.GetGithubUserTokenUseCase
import gong.team.githubclean.ui.Event
import gong.team.githubclean.ui.base.BaseViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    private val getGithubUserTokenUseCase: GetGithubUserTokenUseCase
): BaseViewModel() {

    val loginId = MutableLiveData<String>("")
    val loginPassword = MutableLiveData<String>("")

    private val _navigateToMain = MutableLiveData<Event<Boolean>>()
    val navigateToMain: LiveData<Event<Boolean>>
        get() = _navigateToMain

    private val _errorMsg = MutableLiveData<Event<String>>()
    val errorMsg: LiveData<Event<String>>
        get() = _errorMsg

    fun onClickGetToken(view: View) {
        getGithubUserTokenUseCase.invoke(getHeader(loginId.value!! , loginPassword.value!!))
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onSuccess = {
                    _navigateToMain.value = Event(true)
                } ,
                onError = {
                    _errorMsg.value = Event("아이디와 비빌먼호를 확인하여 주세요")
                    it.printStackTrace()
                }
            ).addTo(compositeDisposable)

    }

    private fun getHeader(name: String , password: String): String {
        val headerString = "$name:$password"
        return "Basic "+Base64.encodeToString(headerString.toByteArray(),Base64.NO_WRAP)
    }

}