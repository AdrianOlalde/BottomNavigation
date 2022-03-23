package com.example.navegation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.navegation.databinding.FragmentMuestraDatosBinding

class MuestraDatos : Fragment() {
    private lateinit var binding: FragmentMuestraDatosBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val datos = arguments?.getStringArray("Datos")
        binding = FragmentMuestraDatosBinding.inflate(inflater, container, false)
        Toast.makeText(context, "$datos.get(0)", Toast.LENGTH_SHORT).show()
        if (datos != null) {
            binding.NombreResultado.text = datos.get(0)
            binding.ApPaternoResultado.text = (datos.get(1))
            binding.ApMaternoResultado.text = (datos.get(2))
            binding.NombreUsuarioResultado.text = (datos.get(3))
            binding.CorreoResultado.text = (datos.get(4))
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}