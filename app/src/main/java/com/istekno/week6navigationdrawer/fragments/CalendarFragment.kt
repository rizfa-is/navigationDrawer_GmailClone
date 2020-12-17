package com.istekno.week6navigationdrawer.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.istekno.week6navigationdrawer.R
import com.istekno.week6navigationdrawer.databinding.FragmentCalendarBinding

class CalendarFragment: Fragment() {

    private lateinit var calendarBinding: FragmentCalendarBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        calendarBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_calendar, container, false)
        // Inflate the layout for this fragment
        return calendarBinding.root
    }
}