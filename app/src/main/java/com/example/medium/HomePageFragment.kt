package com.example.medium

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.medium.databinding.FragmentHomePageBinding


class HomePageFragment : Fragment() {

    private lateinit var binding: FragmentHomePageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentHomePageBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageButtonRoses.setOnClickListener {
            val action = HomePageFragmentDirections.actionHomePageFragmentToRoseFragment()
            Navigation.findNavController(it).navigate(action)
        }
        binding.imageButtonDaisy.setOnClickListener {
            val action = HomePageFragmentDirections.actionHomePageFragmentToDaisyFragment()
            Navigation.findNavController(it).navigate(action)
        }
        binding.imageButtonHydrangea.setOnClickListener {
            val action = HomePageFragmentDirections.actionHomePageFragmentToHydrangeaFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }






}