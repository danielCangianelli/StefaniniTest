package com.negreiros.stefaninitest.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.negreiros.stefaninitest.R
import com.negreiros.stefaninitest.databinding.FragmentHomeBinding
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.ViewHolder

class HomeFragment : Fragment(){

    lateinit var factory: HomeViewModelFactory
    private lateinit var viewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding
    private val groupAdapter = GroupAdapter<ViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_home,
            container,
            false
        )

        viewModel = ViewModelProvider(this, factory)
            .get(HomeViewModel::class.java)
        return binding.root
    }
}