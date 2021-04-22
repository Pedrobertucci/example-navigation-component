package com.test.navGraph

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class FirstFragment : Fragment() {
    private val args: FirstFragmentArgs by navArgs()

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        view.findViewById<TextView>(R.id.textView).text = "First arg: ${args.arg1} second arg: ${args.arg2}"

        view.findViewById<Button>(R.id.button).setOnClickListener {
            val directions = FirstFragmentDirections.actionFirstToSecond("test", "test2")
            findNavController().navigate(directions)
        }

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = FirstFragment()
    }
}