package com.example.praktikum4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ProfileFragment : Fragment() {
    companion object {
        private const val ARG_USERNAME = "arg_username"

        fun newInstance(username: String): ProfileFragment {
            val fragment = ProfileFragment()
            val bundle = Bundle()
            bundle.putString(ARG_USERNAME, username)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val username = arguments?.getString(ARG_USERNAME) ?: "(tidak diketahui)"

        view.findViewById<TextView>(R.id.tvUsernameProfile).text = username
        view.findViewById<TextView>(R.id.tvNamaProfile).text = "Administrator"
        view.findViewById<TextView>(R.id.tvProdiProfile).text = "D3 Teknik Informatika"
        view.findViewById<TextView>(R.id.tvJurusanProfile).text = "Teknik Elektro"
        view.findViewById<TextView>(R.id.tvAlamatProfile).text = "Jl. Brigjen H. Hasan Basry, Banjarmasin"
        view.findViewById<TextView>(R.id.tvNoHpProfile).text = "08123456789"
        view.findViewById<TextView>(R.id.tvEmailProfile).text = "admin@poliban.ac.id"

        return view
    }
}