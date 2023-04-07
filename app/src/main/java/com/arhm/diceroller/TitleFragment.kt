package com.arhm.diceroller

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass.
 * Use the [TitleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TitleFragment : Fragment(R.layout.fragment_title) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startTimeCounter()
        Log.d("DEBUG","Title created")
    }
    private fun startTimeCounter() {
        Log.d("DEBUG","Started")
        object : CountDownTimer(100, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                Log.d("DEBUG","Left $millisUntilFinished")
            }
            override fun onFinish() {
                Log.d("DEBUG","Finished")
                findNavController().navigate(R.id.action_titleFragment_to_loginFragment)
            }
        }.start()
    }
}