package com.example.putatoeassesment.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.putatoeassesment.Product
import com.example.putatoeassesment.R


class ProductAdapter (private  val productList:List<Product>):RecyclerView.Adapter<ProductAdapter.ViewHolder>(){




    inner class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)
    {
        val pname:TextView = itemView.findViewById(R.id.product_name)
        val category:TextView = itemView.findViewById(R.id.product_category)
        val image:ImageView  = itemView.findViewById(R.id.product_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
     val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_popular,parent,false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return productList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      val data = productList[position]
        holder.pname.text = data.name
        holder.category.text= data.category
        holder.image.setImageResource(data.image)
    }

}

