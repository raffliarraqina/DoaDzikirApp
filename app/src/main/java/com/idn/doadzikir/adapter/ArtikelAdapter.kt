package com.idn.doadzikir.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.idn.doadzikir.databinding.ItemArtikelBinding
import com.idn.doadzikir.model.Artikel
import com.idn.doadzikir.utills.OnItemCallBack

class ArtikelAdapter : RecyclerView.Adapter<ArtikelAdapter.ArtikelViewHolder>() {

    private val listArtikel = ArrayList<Artikel>()
    private var onItemCallBack: OnItemCallBack? = null

    fun setData(list: List<Artikel>) {
        listArtikel.clear()
        listArtikel.addAll(list)
    }

    fun setOnItemClickCallback(onItemCallback: OnItemCallBack) {
        this.onItemCallBack = onItemCallback
    }

    inner class ArtikelViewHolder(val view: ItemArtikelBinding) : RecyclerView.ViewHolder(view.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ArtikelViewHolder(
        ItemArtikelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun getItemCount() = listArtikel.size

    override fun onBindViewHolder(holder: ArtikelViewHolder, position: Int) {
        val data = listArtikel[position]
        holder.view.imgArtikel.setImageResource(data.imageArtikel)
        holder.itemView.setOnClickListener { onItemCallBack?.onItemClickled(data) }
    }
}