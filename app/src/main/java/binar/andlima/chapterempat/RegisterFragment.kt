package binar.andlima.chapterempat

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_register.*


class RegisterFragment : Fragment() {

    lateinit var sharepref : SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharepref = requireContext().getSharedPreferences("mainlima", Context.MODE_PRIVATE)

        btn_register.setOnClickListener {
            val nohp = et_input_nohp.text.toString()
            val nama = et_input_nama.text.toString()
            val pass = et_input_password.text.toString()

            val eddit = sharepref.edit()
            eddit.putString("nohp", nohp)
            eddit.apply()


            Navigation.findNavController(view).navigate(R.id.action_registerFragment2_to_loginFragment)
        }
    }

}