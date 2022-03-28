package binar.andlima.chapterempat.pertama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import binar.andlima.chapterempat.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        toast_snack_nav.setOnClickListener {
            startActivity(Intent(this, NavComponentPertama::class.java))
        }
        btn_toast.setOnClickListener {
            val data = "qwerty"
            Toast.makeText(this, "This is Toast $data", Toast.LENGTH_LONG).show()
        }

        btn_snackbar_satu.setOnClickListener {
            Snackbar.make(it,"Ini adalah Snackbar", Snackbar.LENGTH_SHORT).show()
        }

        btn_snackbar_dua.setOnClickListener {
            Snackbar.make(it, "Snackbar Dua", Snackbar.LENGTH_INDEFINITE)
                .setAction("Show Toast"){
                    Toast.makeText(this, "Ini Toast dari Snackbar dua",Toast.LENGTH_LONG).show()
                }
                .setAction("Show Toast 2"){
                    Toast.makeText(this, "Ini Toast dari Snackbar dua",Toast.LENGTH_LONG).show()
                }
                .show()
        }

        btn_snackbar_tiga.setOnClickListener {
           val aa =  Snackbar.make(it, "Snackbar Dua", Snackbar.LENGTH_INDEFINITE)
                   aa.setAction("Dismiss"){
                       aa.dismiss()
                   }
                aa.show()
        }

    }
}