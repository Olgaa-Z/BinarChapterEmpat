package binar.andlima.chapterempat.kedua

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import binar.andlima.chapterempat.R
import kotlinx.android.synthetic.main.fragment_alert_dialog.*

class AlertDialogFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alert_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        proses.setOnClickListener {
            val umur = et_umur.text.toString()
            Toast.makeText(requireContext(), "Umur anda :$umur ", Toast.LENGTH_LONG).show()
            dismiss()
        }

    }

}