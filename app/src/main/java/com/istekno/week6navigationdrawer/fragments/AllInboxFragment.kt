package com.istekno.week6navigationdrawer.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.istekno.week6navigationdrawer.R
import com.istekno.week6navigationdrawer.databinding.FragmentAllInboxBinding

class AllInboxFragment : Fragment() {

    private lateinit var allInboxBinding: FragmentAllInboxBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        allInboxBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_all_inbox, container, false)
        // Inflate the layout for this fragment
        return allInboxBinding.root
    }

}