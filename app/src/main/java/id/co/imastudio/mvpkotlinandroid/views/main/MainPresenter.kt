package id.co.imastudio.mvpkotlinandroid.views.main

import id.co.imastudio.mvpkotlinandroid.model.Barang
import id.co.imastudio.mvpkotlinandroid.views.Base.Presenter

/**
 * Created by nandoseptianhusni on 12/27/17.
 */
class MainPresenter : Presenter<MainView> {

    var mView: MainView? = null
    override fun onAttack(view: MainView) {

        mView = view
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDetach() {
        mView = null


        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    fun getData(nama: String, stock: String) {

        if (nama.isNotEmpty() && stock.isNotEmpty()) {


            var data = mutableListOf<Barang>()


            var b = Barang()
            b?.nama = nama
            b?.stock = stock




            mView?.onMasuk(data)
        } else {
            mView?.Error("tidak boleh kosong")
        }


    }

}