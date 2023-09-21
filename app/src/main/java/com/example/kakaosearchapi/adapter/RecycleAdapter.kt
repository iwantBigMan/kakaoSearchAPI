package com.example.kakaosearchapi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.kakaosearchapi.R

//class RecycleAdapter(var list: ArrayList<String>): RecyclerView.Adapter<RecycleAdapter.GridAdapter>() {
//
//    class GridAdapter(val layout: View): RecyclerView.ViewHolder(layout)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridAdapter {
//        var view = LayoutInflater.from(parent.context).inflate(R.layout.search_result_item, parent, false)
//
//        return GridAdapter(view)
//    }
//
//    override fun onBindViewHolder(holder: GridAdapter, position: Int) {
//        holder.layout.textListTitle.text = list[position]
//
//        holder.layout.layoutListItem.setOnClickListener {
//            Toast.makeText(holder.layout.context, "${list[position]} Click!", Toast.LENGTH_SHORT).show()
//        }
//    }
//
//    override fun getItemCount(): Int {
//        return list.size
//    }
//}

//class MyAdapter(val mItems: MutableList<MyItem>) : RecyclerView.Adapter<MyAdapter.Holder>() {
//
//    interface ItemClick {
//        fun onClick(view : View, position : Int)
//    }
//
//    var itemClick : ItemClick? = null
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
//        val binding = ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return Holder(binding)
//    }
//
//    override fun onBindViewHolder(holder: Holder, position: Int) {
//        holder.itemView.setOnClickListener {  //클릭이벤트추가부분
//            itemClick?.onClick(it, position)
//        }
//        holder.iconImageView.setImageResource(mItems[position].aIcon)
//        holder.name.text = mItems[position].aName
//        holder.age.text = mItems[position].aAge
//    }
//
//    override fun getItemId(position: Int): Long {
//        return position.toLong()
//    }
//
//    override fun getItemCount(): Int {
//        return mItems.size
//    }
//
//    inner class Holder(val binding: ItemRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root) {
//        val iconImageView = binding.iconItem
//        val name = binding.textItem1
//        val age = binding.textItem2
//    }
//}