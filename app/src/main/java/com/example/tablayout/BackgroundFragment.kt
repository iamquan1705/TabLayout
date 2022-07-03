package com.example.tablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tablayout.databinding.FragmentBackgroundBinding

class BackgroundFragment : Fragment() {
    companion object {
        fun newInstance(): BackgroundFragment {
            return BackgroundFragment()
        }
    }

    private lateinit var binding: FragmentBackgroundBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBackgroundBinding.inflate(inflater, container, false)
        return binding.root
    }
}