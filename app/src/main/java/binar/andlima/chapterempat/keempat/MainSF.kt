package binar.andlima.chapterempat.keempat

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.andlima.chapterempat.R
import kotlinx.android.synthetic.main.activity_main_sf.*

class MainSF : AppCompatActivity() {

//    MEMBUAT VARIABLE GLOBAL
    lateinit var prefs : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sf)

//        untuk cek apakah data sudah ada di sharedpreferences, jika sudah ada data nama
//        maka dia pindah ke halaman / activity kedua

        if (getSharedPreferences("contoh" , Context.MODE_PRIVATE).contains("NAMA")){
            startActivity(Intent(this, MainSFDua::class.java))
            finish()
        }

//        INITIALIZE ISI DARI VARIABLE GLOBAL
        prefs = getSharedPreferences("contoh" , Context.MODE_PRIVATE)
        SharedPrefExample()

    }

    fun  SharedPrefExample(){
        btn_simpan.setOnClickListener {

//            LNGKAH MEMASUKKAN DATA KE SHAREDPREFERENCES
            val datanama = enter_nama.text.toString()
            val sf = prefs.edit()
            sf.putString("NAMA", datanama )
            sf.apply()

//            MEMULAI ACTIVITY TUJUAN
            startActivity(Intent(this,MainSFDua::class.java))
            finish()
        }
    }
}