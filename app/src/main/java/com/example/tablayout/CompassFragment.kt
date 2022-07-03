package com.example.tablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tablayout.databinding.FragmentCompassBinding

class CompassFragment : Fragment() {
    companion object {
        fun newInstance(): CompassFragment {
            return CompassFragment()
        }
    }

    private lateinit var binding: FragmentCompassBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCompassBinding.inflate(inflater, container, false)
        return binding.root
    }
}