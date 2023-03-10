package com.example.geoaxborot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.geoaxborot.adapters.MyFragmentViewPagerAdapter
import com.example.geoaxborot.databinding.ActivityMainBinding
import com.example.geoaxborot.models.MyShablon

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var list: ArrayList<MyShablon>
    private lateinit var myFragmentViewPagerAdapter: MyFragmentViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding.btnRoyhat.setOnClickListener {
            binding.myViewPager.setCurrentItem(binding.myViewPager.currentItem +1, true)
        }
        binding.btnOtkaz.setOnClickListener {
            binding.myViewPager.setCurrentItem(binding.myViewPager.currentItem -1, true)
        }
        list = ArrayList()
        list.add(MyShablon("https://avatars.mds.yandex.net/get-images-cbir/4361068/hQy51qHuPQ6zVhrXH9ygnQ5130/ocr", "GeoAxborot"))
        list.add(MyShablon("https://avatars.mds.yandex.net/get-images-cbir/1722655/gWBXuaA8J50rk_wshNKTiw8483/ocr", "Huquqiy Axborot"))
        list.add(MyShablon("https://avatars.mds.yandex.net/get-images-cbir/4801428/xwQe1v4F296T3LR3kv6tnw5238/ocr", "To'lo'vlar xizmatlari"))
        list.add(MyShablon("https://avatars.mds.yandex.net/get-images-cbir/7157790/Ex-svV3MBE0Lu4nMp6mnXw5362/ocr", "Qo'shimcha Imkoniyat"))

        myFragmentViewPagerAdapter = MyFragmentViewPagerAdapter(supportFragmentManager, list)
        binding.myViewPager.adapter = myFragmentViewPagerAdapter

        binding.myTabLayout.setupWithViewPager(binding.myViewPager)
    }
}