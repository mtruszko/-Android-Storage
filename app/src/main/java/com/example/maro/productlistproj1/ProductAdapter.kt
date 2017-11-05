package com.example.maro.productlistproj1

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by maro on 17.10.2017.
 */
class ProductAdapter : RecyclerView.Adapter<ProductViewHolder>() {

    var items = listOf<Product>()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ProductViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.viewholder_product, parent, false))

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) =
            holder.bind(items[position])
}