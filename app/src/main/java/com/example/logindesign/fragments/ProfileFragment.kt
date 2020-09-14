package com.example.logindesign.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.logindesign.R
import kotlinx.android.synthetic.main.fragment_profile.view.*

private const val NAME = "param1"
private const val EMAIL = "param2"
private const val BIRTH = "param3"
private const val WORK = "param4"

class ProfileFragment : Fragment() {
    private var name: String? = null
    private var email: String? = null
    private var birth: String? = null
    private var work: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(NAME)
            email = it.getString(EMAIL)
            birth = it.getString(BIRTH)
            work = it.getString(WORK)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_profile, container, false)

        init(view)

        return view
    }

    private fun init(view: View){
        view.profile_name.text = name
        view.profile_email.text = email
        view.profile_birth.text = birth
        view.profile_work.text = work
    }

    companion object {
        fun newInstance(param1: String, param2: String, param3: String, param4: String) =
            ProfileFragment().apply {
                arguments = Bundle().apply {
                    putString(NAME, param1)
                    putString(EMAIL, param2)
                    putString(BIRTH, param3)
                    putString(WORK, param4)
                }
            }
    }
}