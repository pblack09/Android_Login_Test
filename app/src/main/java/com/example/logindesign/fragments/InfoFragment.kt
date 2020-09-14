package com.example.logindesign.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.logindesign.R
import com.example.logindesign.activities.HomeActivity
import kotlinx.android.synthetic.main.fragment_info.*
import kotlinx.android.synthetic.main.fragment_info.view.*

class InfoFragment : Fragment() {

    var listener: OnFragmentInteraction? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_info, container, false)

        init(view)

        return view
    }

    private fun init(view: View){
        view.fragment_submit.setOnClickListener{
            var name = view.fragment_name.text.toString()
            var email = view.fragment_email.text.toString()
            var birth = view.fragment_birth.text.toString()
            var work = view.fragment_work.text.toString()

            listener?.onButtonClicked(name, email, birth, work)
        }
    }

    interface OnFragmentInteraction{
        fun onButtonClicked(name: String, email: String, birth: String, work: String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as HomeActivity
    }

}