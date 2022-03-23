package com.example.navegation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navegation.databinding.FragmentProfileBinding


class profileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        val navController = findNavController()
        binding.btnEnviar.setOnClickListener{
            val direcction = profileFragmentDirections.actionProfileFragmentToMuestraDatos(arrayOf(binding.FieldNombre.text.toString(), binding.FieldApPaterno.text.toString(),binding.FieldApMaterno.text.toString(), binding.FieldNombreUsuario.text.toString(), binding.FieldCorreo.text.toString()))
            findNavController().navigate(direcction)
        }
        return binding.root
    }
}