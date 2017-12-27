package id.co.imastudio.mvpkotlinandroid.views.main

import id.co.imastudio.mvpkotlinandroid.model.Barang
import id.co.imastudio.mvpkotlinandroid.views.Base.View
/**
 * Created by nandoseptianhusni on 12/27/17.
 */
interface MainView : View {

    fun onMasuk(data: MutableList<Barang>)
    fun Error(msg : String)



}