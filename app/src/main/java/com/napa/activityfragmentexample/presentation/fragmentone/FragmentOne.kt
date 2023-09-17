package com.napa.activityfragmentexample.presentation.fragmentone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.napa.activityfragmentexample.R
import com.napa.activityfragmentexample.databinding.FragmentOneBinding
import com.napa.activityfragmentexample.model.Person

class FragmentOne : Fragment() {

    private lateinit var binding : FragmentOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOneBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setClickListener()
    }

    private fun setClickListener() {
        binding.btnNavigate.setOnClickListener {
            navigateToFragmentTwo()
        }
        binding.btnSendDataNavigate.setOnClickListener {
            navigateToFragmentTwo(getPerson())
        }
    }

    private fun getPerson(): Person? {
        return Person(
            name = "Tony Stark",
            job = "The Mechanic",
            profileDesc = "Genius, Billionarie, Playboy, Philantropist",
            profilePictUrl = "https://images.bisnis.com/posts/2017/06/22/665183/tony-stark.jpg"
        )
    }

    private fun navigateToFragmentTwo(person: Person? = null) {
        //bundle
        /*findNavController().navigate(R.id.action_fragmentOne_to_fragmentTwo,Bundle().apply {
            putParcelable("person",person)
        })*/
        val action:NavDirections = FragmentOneDirections.actionFragmentOneToFragmentTwo(person)
        findNavController().navigate(action)
    }
}