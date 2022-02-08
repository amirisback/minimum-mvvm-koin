package com.frogobox.minimummvvm

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


/*
 * Created by faisalamir on 07/02/22
 * recyclercoroutines
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 FrogoBox Inc.      
 * All rights reserved
 *
 */

class MainAdapter(private val listener: MainItemListener) : RecyclerView.Adapter<MainHolder>(){

    private val listData = mutableListOf<MainData>()

    fun setContent(data: List<MainData>) {
        listData.clear()
        listData.addAll(data)
    }

    fun notifyInserted(data: MainData, position: Int) {
        listData.add(position, data)
        notifyItemInserted(position)
    }

    fun clearData() {
        listData.clear()
        notifyItemRangeRemoved(0, listData.size - 1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bindItem(listData[position], listener)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

}