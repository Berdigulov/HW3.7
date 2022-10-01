package com.example.hw37

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw37.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private var imageList = arrayListOf<Character>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = ImageAdapter(imageList,this::onClick)
        binding.recyclerImage.adapter = adapter
    }

    private fun loadData(){
        imageList.add(Character("Bart Simpson","Alive","https://www.pngall.com/wp-content/uploads/2016/06/Bart-Simpson-PNG-Image.png"))
        imageList.add(Character("Gomer Simpson","Alive","https://www.pngitem.com/pimgs/m/136-1364253_now-you-can-download-simpsons-icon-png-homer.png"))
        imageList.add(Character("Morty","Alive","https://cdn141.picsart.com/367098793036211.png"))
        imageList.add(Character("Rick Sanchez","Alive","https://www.pngitem.com/pimgs/m/85-852034_rick-sanchez-png-rick-with-portal-gun-transparent.png"))


    }

    private fun onClick(position: Int){
        val bundle = Bundle()
        bundle.putSerializable("key",imageList[position])
        findNavController().navigate(R.id.secondFragment,bundle)
    }

}