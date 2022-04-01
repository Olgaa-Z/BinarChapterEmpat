package binar.andlima.chapterempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.andlima.chapterempat.kedua.AlertDialogActivity
import binar.andlima.chapterempat.ketiga.DataMahasiswaActivity
import binar.andlima.chapterempat.pertama.FirstActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pertama.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }
        kedua.setOnClickListener {
            startActivity(Intent(this, AlertDialogActivity::class.java))

        }

        ketiga.setOnClickListener {
            startActivity(Intent(this, DataMahasiswaActivity::class.java))

        }


    }
}