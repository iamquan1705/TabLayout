package com.example.tablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.tablayout.databinding.FragmentMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        initView()
        return binding.root
    }

    private var listTitle = arrayListOf(
        "Compass",
        "Background"
    )

    private fun initView() {
        val tabs = binding.tabLayout.getChildAt(0) as ViewGroup
        for (i in 0 until tabs.childCount ) {
            val tab = tabs.getChildAt(i)
            val layoutParams = tab.layoutParams as LinearLayout.LayoutParams
            layoutParams.marginEnd = 20
            layoutParams.marginStart = 20
            tab.layoutParams = layoutParams
            binding.tabLayout.requestLayout()
        }
        activity?.let { act ->
            var adapter = FragmentAdapter(act as AppCompatActivity)
            binding.viewPager.adapter = adapter
            TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
                tab.text = listTitle[position]
            }.attach()

        }

    }
}