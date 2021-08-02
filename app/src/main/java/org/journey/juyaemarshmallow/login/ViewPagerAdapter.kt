package org.journey.juyaemarshmallow.login

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import org.journey.juyaemarshmallow.R

class ViewPagerAdapter( val imageList : List<Int>) :RecyclerView.Adapter<ViewPagerAdapter.PagerViewHolder>() {
    val item = imageList

    class PagerViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder
        (LayoutInflater.from(parent.context).inflate(R.layout.item_login_pager, parent, false)){

    }
    override fun getItemCount(): Int = item.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PagerViewHolder((parent))

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.itemView.setBackgroundResource(item[position])

    }
}