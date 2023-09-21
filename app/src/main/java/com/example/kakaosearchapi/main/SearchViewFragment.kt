package com.example.kakaosearchapi.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kakaosearchapi.R
import com.example.kakaosearchapi.databinding.FragmentSearchViewBinding

class SearchViewFragment : Fragment() {
    private var _binding: FragmentSearchViewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
        _binding = FragmentSearchViewBinding.inflate(inflater, container, false)
        return binding.root
    }

}