package com.example.kakaosearchapi.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager2.widget.ViewPager2
import com.example.kakaosearchapi.R
import com.example.kakaosearchapi.adapter.ViewPagerAdapter
import com.example.kakaosearchapi.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView(){
        var viewPagerAdapter = ViewPagerAdapter(this)
        viewPagerAdapter.addFragment(SearchViewFragment())
        viewPagerAdapter.addFragment(LockerViewFragment())

        binding.mainView.apply {
            adapter = viewPagerAdapter

            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            })
        }

        TabLayoutMediator(binding.tlNavigationView, binding.mainView) { tab, position ->
            Log.e("YMC", "ViewPager position: ${position}")
            when (position) {
                0 -> tab.text = "검색 결과"
                1 -> tab.text = "내 보관함"

            }
        }.attach()
    }
}