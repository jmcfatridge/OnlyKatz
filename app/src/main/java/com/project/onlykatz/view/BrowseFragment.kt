package com.project.onlykatz.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.project.onlykatz.R
import com.project.onlykatz.databinding.FragmentBrowseBinding
import com.project.onlykatz.databinding.FragmentSettingsBinding

class BrowseFragment : Fragment(R.layout.fragment_browse) {

    private lateinit var binding: FragmentBrowseBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBrowseBinding.bind(view)
        initViews()
    }

    //with(receiver) is 1 of 5 scope functions
    private fun initViews() = with(binding) {
        detailsButton.setOnClickListener {
            //Without safeArgs
//            findNavController().navigate(R.id.action_browseFragment_to_detailsFragment)

            //With safeArgs
            val direction = BrowseFragmentDirections.actionBrowseFragmentToDetailsFragment()
            findNavController().navigate(direction)
        }
        settingsButton.setOnClickListener {
            findNavController().navigate(R.id.action_browseFragment_to_settingsFragment)
        }
    }

}