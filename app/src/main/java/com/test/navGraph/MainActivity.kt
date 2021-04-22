package com.test.navGraph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.nav_host_fragment)
        val bundle = Bundle()
        bundle.putString("arg1","your value 1")
        bundle.putString("arg2","your value 2")
        navController.setGraph(navController.graph, bundle)
    }
}