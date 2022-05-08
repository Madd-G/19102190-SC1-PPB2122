package com.example.praktikum6.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.praktikum6.DetailActivity
import com.example.praktikum6.MyData
import com.example.praktikum6.R
import kotlinx.android.synthetic.main.item_list.view.*

class ListMyDataAdapter(private val listMyDatas: ArrayList<MyData>, val context: Context) :
    RecyclerView.Adapter<ListMyDataAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
//        holder.bind(listMyData[position])

        val myData = listMyDatas[position]
        Glide.with(holder.itemView.context)
            .load(myData.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = myData.name
        holder.tvDetail.text = myData.description

        holder.itemView.setOnClickListener {
            holder.itemView.setOnClickListener {
                val moveWithObjectIntent = Intent(context, DetailActivity::class.java)
                moveWithObjectIntent.putExtra(DetailActivity.EXTRA_MYDATA, myData)
                context.startActivity(moveWithObjectIntent)
            }
        }
    }
    override fun getItemCount(): Int {
        return listMyDatas.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        fun bind(myData: MyData) {
//            with(itemView){
//                Glide.with(itemView.context)
//                    .load(myData.photo)
//                    .apply(RequestOptions().override(55, 55))
//                    .into(img_item_photo)
//                tv_item_name.text = myData.name
//                tv_item_description.text = myData.description
//            }
//        }

        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_description)
    }


}