package com.example.putatoeassesment.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.putatoeassesment.Adapter.ProductAdapter
import com.example.putatoeassesment.Product
import com.example.putatoeassesment.R
import com.example.putatoeassesment.databinding.ActivityMainBinding
import com.example.putatoeassesment.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
   lateinit var  binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(layoutInflater,container,false);



val imageList  = ArrayList<SlideModel>();


        imageList.add(SlideModel(R.drawable.one,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.two,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.three,ScaleTypes.FIT))

        // Inflate the layout for this fragment

        binding.imageSlider.setImageList(imageList,ScaleTypes.FIT);


        val dataList  = ArrayList<Product>();
        dataList.add(Product("Frooti","coldDrink",1,R.drawable.fruti))
        dataList.add(Product("Frooti","coldDrink",1,R.drawable.fruti))
        dataList.add(Product("Frooti","coldDrink",1,R.drawable.fruti))
        dataList.add(Product("Frooti","coldDrink",1,R.drawable.fruti))
        dataList.add(Product("Frooti","coldDrink",1,R.drawable.fruti))
        dataList.add(Product("Frooti","coldDrink",1,R.drawable.fruti))
        dataList.add(Product("Frooti","coldDrink",1,R.drawable.fruti))




        val dairyList = ArrayList<Product>()
        dairyList.add(Product("Ghee","Dairy",200,R.drawable.ghee))
        dairyList.add(Product("Ghee","Dairy",200,R.drawable.ghee))
        dairyList.add(Product("Ghee","Dairy",200,R.drawable.ghee))
        dairyList.add(Product("Ghee","Dairy",200,R.drawable.ghee))
        dairyList.add(Product("Ghee","Dairy",200,R.drawable.ghee))
        dairyList.add(Product("Ghee","Dairy",200,R.drawable.ghee))

        // sertitng up recyclerView of Product
        val adapter = ProductAdapter(dataList)
        binding.recyclerView.layoutManager= LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false);
        binding.recyclerView.adapter= adapter

        //setting up second static datas

        val nextAdapter = ProductAdapter(dairyList)
        binding.dairyRecyclerView.layoutManager= LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false
        )
        binding.dairyRecyclerView.adapter=nextAdapter





        return binding.root
    }



}