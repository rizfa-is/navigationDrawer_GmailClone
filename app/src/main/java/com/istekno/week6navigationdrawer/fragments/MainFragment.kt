package com.istekno.week6navigationdrawer.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.istekno.week6navigationdrawer.R
import com.istekno.week6navigationdrawer.databinding.FragmentAllInboxBinding
import com.istekno.week6navigationdrawer.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var mainFragment: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mainFragment = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        // Inflate the layout for this fragment
        return mainFragment.root
    }
}