package id.co.imastudio.mvpkotlinandroid.views.Base

import android.view.View

/**
 * Created by nandoseptianhusni on 12/27/17.
 */
interface Presenter<in T : id.co.imastudio.mvpkotlinandroid.views.Base.View> {

    fun onAttack(view : T)

    fun onDetach()
}