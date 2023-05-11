package com.yogi.komikku

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class komikAdapter (private val context: Context, public val komikList: ArrayList<Komik>, val listener: (Komik) -> Unit): RecyclerView.Adapter<komikAdapter.komikViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): komikViewHolder{
    val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_komik, parent, false)
    return komikViewHolder(itemView)}

    override fun onBindViewHolder(holder: komikViewHolder, position: Int) {
        val currentItem = komikList[position]
        holder.imgKomik.setImageResource(currentItem.imgKomik)

        holder.titleKomik.text = (currentItem.nameKomik)
        holder.chptKomik.text = (currentItem.chapter.toString())
        holder.rateKomik.text = (currentItem.rate)
        holder.bindView(komikList[position], listener)

    }

    override fun getItemCount(): Int {
        return komikList.size
    }

    class komikViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val imgKomik : ImageView= itemView.findViewById(R.id.ivPhoto)
        val titleKomik : TextView =  itemView.findViewById(R.id.tvJudul)
        val chptKomik : TextView = itemView.findViewById(R.id.tvDesc)
        val rateKomik : TextView = itemView.findViewById(R.id.tvrate)

        fun bindView(komik: Komik, listener: (Komik) -> Unit){
            imgKomik.setImageResource(komik.imgKomik)

            titleKomik.text = komik.nameKomik
            chptKomik.text = "episode "+komik.chapter
            rateKomik.text = komik.rate
            itemView.setOnClickListener{
                listener(komik)
            }
        }
    }

}
