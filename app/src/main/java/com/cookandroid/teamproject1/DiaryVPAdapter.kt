package com.cookandroid.teamproject1

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class DiaryVPAdapter(fragment : Fragment) : FragmentStateAdapter(fragment){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> DiaryListFragment()
            else -> DiaryMapFragment()
        }
    }

}