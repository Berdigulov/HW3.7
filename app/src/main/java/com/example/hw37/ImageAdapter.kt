package com.example.hw37


import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.hw37.databinding.ItemImageBinding


class ImageAdapter(
    val data:ArrayList<Character>,
    val onClick:(position: Int) -> Unit
    ):RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(ItemImageBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = data.size



    inner class ImageViewHolder(private val binding: ItemImageBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = data[adapterPosition]

            itemView.setOnClickListener {
                onClick(adapterPosition)
            }


            binding.tvName.text = item.name
            binding.tvSurvive.text = item.survive
            binding.ivImage.loadImage(item.image.toString())
        }


    }
}