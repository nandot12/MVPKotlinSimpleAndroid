package id.co.imastudio.mvpkotlinandroid.views.main

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.co.imastudio.mvpkotlinandroid.R
import id.co.imastudio.mvpkotlinandroid.model.Barang
import kotlinx.android.synthetic.main.list_item.view.*

/**
 * Created by nandoseptianhusni on 12/27/17.
 */
class RecyclerAdapter (c: AppCompatActivity?, data: MutableCollection<Barang>?): RecyclerView.Adapter<RecyclerAdapter.MyHolder>() {

    var c : AppCompatActivity? = null
    var data : MutableCollection<Barang>? = null

    init {
        this.c  = c
        this.data = data
    }

    override fun onBindViewHolder(holder: MyHolder?, position: Int) {

        holder?.binView(data?.elementAt(position))
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {

        var view = LayoutInflater.from(c).inflate(R.layout.list_item,parent,false)


        return MyHolder(view)
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {

        return data?.count()!!
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun binView(get: Barang?) {
            itemView.text1.text = get?.nama
            itemView.text2.text = get?.stock

        }


    }
}