package binar.andlima.chapterempat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_first.btn_toast
import kotlinx.android.synthetic.main.fragment_screen_satu.*

class ScreenSatuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_toast.setOnClickListener {
            Toast.makeText(requireContext(), "this is Toast", Toast.LENGTH_LONG).show()
        }

        btn_snackbar.setOnClickListener {
            Snackbar.make(it, "Ini Snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Move"){
                    Navigation.findNavController(view).navigate(R.id.action_screenSatuFragment_to_screenDuaFragment)
                }
                .show()
        }
    }


}