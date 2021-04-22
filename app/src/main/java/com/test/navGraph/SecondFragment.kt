package com.test.navGraph

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment() {
    private val args: SecondFragmentArgs by navArgs()

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val view =  inflater.inflate(R.layout.fragment_second, container, false)
        view.findViewById<TextView>(R.id.textView).text = "first arg: ${args.arg1} second arg: ${args.arg2}"
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = SecondFragment()
    }
}