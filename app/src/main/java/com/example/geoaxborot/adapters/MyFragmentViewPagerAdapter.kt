package com.example.geoaxborot.adapters
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.geoaxborot.fragments.ItemFragment
import com.example.geoaxborot.models.MyShablon
class MyFragmentViewPagerAdapter(fragmentManager: FragmentManager, val list:List<MyShablon>):
    FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Fragment {
        return ItemFragment.newInstance(list[position].image, list[position].title)
    }
}