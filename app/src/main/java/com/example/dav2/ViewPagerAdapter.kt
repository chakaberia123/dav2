package com.example.viewpagerrecyclerview

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> RecyclerViewFragment.newInstance()
            1 -> RecyclerViewFragment.newInstance()
            else -> RecyclerViewFragment.newInstance()
        }
    }
}
