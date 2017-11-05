package com.example.maro.productlistproj1

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.viewholder_product.view.*

/**
 * Created by maro on 17.10.2017.
 */
class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(product: Product) {
            itemView.name.text = product.name
    }
}