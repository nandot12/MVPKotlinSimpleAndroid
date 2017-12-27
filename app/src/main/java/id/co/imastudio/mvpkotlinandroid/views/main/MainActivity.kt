package id.co.imastudio.mvpkotlinandroid.views.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import id.co.imastudio.mvpkotlinandroid.R

import id.co.imastudio.mvpkotlinandroid.model.Barang
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {



    lateinit var presenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresesnter()
        onAttach()



    }

    private fun initPresesnter() {

        presenter = MainPresenter()


       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAttach() {

        presenter.onAttack(this)
        addButton()
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun addButton() {

        buttoninsert.setOnClickListener {
            presenter.getData(inputnama.text.toString(),inputstick.text.toString())

        }
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDetach() {

        presenter.onDetach()
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onMasuk(data:MutableList<Barang>) {

//        Log.d("data ",data.get())
//        Log.d("data ",data?.get(0)?.stock)
        recycler.adapter = RecyclerAdapter(this, data)
        recycler.layoutManager = LinearLayoutManager(this)




        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun Error(msg: String) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
