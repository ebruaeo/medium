package com.example.medium

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.medium.databinding.FragmentDaisyBinding


class DaisyFragment : Fragment() {

private lateinit var binding: FragmentDaisyBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding = FragmentDaisyBinding.inflate(inflater,container, false)
        return binding.root
    }

}