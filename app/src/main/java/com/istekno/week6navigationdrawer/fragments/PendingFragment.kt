package com.istekno.week6navigationdrawer.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.istekno.week6navigationdrawer.R
import com.istekno.week6navigationdrawer.databinding.FragmentPendingBinding

class PendingFragment: Fragment() {

    private lateinit var pendingBinding: FragmentPendingBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        pendingBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_pending, container, false)
        // Inflate the layout for this fragment
        return pendingBinding.root
    }
}