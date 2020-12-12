package com.negreiros.stefaninitest.presentation.ui

import com.bumptech.glide.request.RequestOptions
import com.negreiros.stefaninitest.R
import com.negreiros.stefaninitest.data.model.Image
import com.negreiros.stefaninitest.databinding.ItemHomeBinding
import com.negreiros.stefaninitest.loadWithURL
import com.xwray.groupie.databinding.BindableItem

class HomeItem(private val image: Image) : BindableItem<ItemHomeBinding>() {
    override fun getLayout(): Int = R.layout.item_home

    override fun bind(viewBinding: ItemHomeBinding, position: Int) {
        viewBinding.apply {
            ivItemHome.loadWithURL(
                image.link,
                RequestOptions()
                    .placeholder(R.drawable.ic_loading)
                    .error(R.drawable.ic_error)
                )
        }
    }
}