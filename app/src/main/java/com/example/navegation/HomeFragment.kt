package com.example.navegation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.navegation.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        val navController = findNavController()
        binding.botonInsideHome.setOnClickListener{

            //navController.navigate(R.id.action_homeFragment_to_insideHome)
            val direccion = HomeFragmentDirections.actionHomeFragmentToInsideHome("Hola mundo")
            findNavController().navigate(direccion)
        }
        return binding.root
    }

}