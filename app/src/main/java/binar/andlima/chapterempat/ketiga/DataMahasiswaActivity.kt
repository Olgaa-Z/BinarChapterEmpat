package binar.andlima.chapterempat.ketiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import binar.andlima.chapterempat.R
import kotlinx.android.synthetic.main.activity_data_mahasiswa.*

class DataMahasiswaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_mahasiswa)

        val datamahasiswa = arrayListOf(
            DataMhs("Ani","23",R.drawable.ic_dashboard_black_24dp),
            DataMhs("Budi Santoso","8",R.drawable.ic_dashboard_black_24dp),
            DataMhs("Masrshanda","27",R.drawable.ic_dashboard_black_24dp),
            DataMhs("Baim Wong","32",R.drawable.ic_dashboard_black_24dp),
            DataMhs("Paula","18", R.drawable.ic_dashboard_black_24dp),
            DataMhs("Zelvia Olga","23",R.drawable.ic_dashboard_black_24dp)
        )

        val adapt = AdapterMahasiswa(datamahasiswa)
        val laymanager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        rvmahasiswa.layoutManager = laymanager
        rvmahasiswa.adapter = adapt

    }
}