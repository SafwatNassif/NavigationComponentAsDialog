package com.example.navigationaddfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationaddfragment.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    var binding: FragmentStartBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding?.root!!


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(requireContext(), "created", Toast.LENGTH_LONG).show()

        binding?.btnNav?.setOnClickListener {
            findNavController().navigate(R.id.to_sec_fragment)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}