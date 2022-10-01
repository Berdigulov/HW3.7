package com.example.hw37

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw37.databinding.FragmentFirstBinding
import com.example.hw37.databinding.FragmentSecondBinding
import java.io.Serializable

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = Bundle()
        var image2: Character = arguments?.getSerializable("key") as Character
        binding.tvName.text = image2.name
        binding.tvSurvive.text = image2.survive
        image2.image?.let { binding.ivImage.loadImage(it) }

    }

}