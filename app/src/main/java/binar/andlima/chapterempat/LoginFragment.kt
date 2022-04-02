package binar.andlima.chapterempat

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {

    private lateinit var sf : SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        sf = requireContext().getSharedPreferences("mainlima", Context.MODE_PRIVATE)


        btn_login.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_homeFragment)
        }

        tv_register.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment2)

        }


    }

    fun login(){
        val nohp = et_nohp.text.toString()
        val password = et_password.text.toString()
//        if(nohp ){
//        }
    }



}