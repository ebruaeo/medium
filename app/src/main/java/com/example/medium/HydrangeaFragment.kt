package com.example.medium

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.medium.databinding.FragmentHydrangeaBinding


class HydrangeaFragment : Fragment() {
  private lateinit var binding: FragmentHydrangeaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding= FragmentHydrangeaBinding.inflate(inflater,container,false)
        return binding.root
    }

}