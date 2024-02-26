package com.example.medium

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.medium.databinding.FragmentRoseBinding


class RoseFragment : Fragment() {

    private lateinit var binding: FragmentRoseBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
   binding = FragmentRoseBinding.inflate(inflater,container,false)
        return binding.root
    }

}