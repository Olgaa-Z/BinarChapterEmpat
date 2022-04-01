package binar.andlima.chapterempat.keempat

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.andlima.chapterempat.R
import kotlinx.android.synthetic.main.activity_main_sfdua.*

class MainSFDua : AppCompatActivity() {
    lateinit var sf : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sfdua)

//        key ini harus smaa dengan sharedpreferences diawal
        sf = getSharedPreferences("contoh" , Context.MODE_PRIVATE)
        val getnama = sf.getString("NAMA","")

        getnama_sf.text= getnama

        logout_sf.setOnClickListener {
            logout()
        }

    }

    fun logout(){
        val logoutsf = sf.edit()
        logoutsf.clear()
        logoutsf.apply()

        startActivity(Intent(this, MainSF::class.java))
        finish()
    }
}