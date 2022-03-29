package binar.andlima.chapterempat.kedua

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import binar.andlima.chapterempat.R
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import kotlinx.android.synthetic.main.custom_dialog.*
import kotlinx.android.synthetic.main.custom_dialog.view.*

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        alert_satu.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Title Example")
                .setMessage("Contoh pesan dari Alert Dialog Standard")
                .setCancelable(true)
                .setIcon(R.drawable.ic_home_black_24dp)
                .show()
        }

        alert_dua.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Hapus Data")
                .setMessage("Yakin Hapus Data ? ")
                .setCancelable(false)
                .setPositiveButton("Ya"){ dialogInterface: DialogInterface, i: Int ->
//                    ACTION YG AKAN TERJADI KETIKA KLIK "YA"
                    Toast.makeText(this, "Data anda terhapus", Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("Tidak"){ dialogInterface: DialogInterface, i: Int ->
//                      Action jika klik tidak

                }
                .show()
        }

        alert_tiga.setOnClickListener {
            val aa = AlertDialog.Builder(this)
            val ab = aa.create()
            aa.setTitle("Example of Dismiss")
            aa.setMessage("isi Message dari example of dismiss")
            aa.setPositiveButton("ya"){ dialogInterface: DialogInterface, i: Int ->
                Toast.makeText(this, "Toast ya", Toast.LENGTH_LONG).show()
            }
            aa.setNeutralButton("Dismiss"){ dialogInterface: DialogInterface, i: Int ->
                ab.dismiss()
            }
            aa.show()
        }
        alert_empat.setOnClickListener {
            val customdialog = LayoutInflater.from(this).inflate(R.layout.custom_dialog, null, false)
           val ab =  AlertDialog.Builder(this)
                .setView(customdialog)
                .create()



            customdialog.btn_customalert.setOnClickListener {
                val nama = customdialog.et_nama.text.toString()
                get_nama.text= nama
                Toast.makeText(this, "$nama", Toast.LENGTH_LONG).show()
                ab.dismiss()
            }
            ab.show()

        }

        alert_lima.setOnClickListener {
            AlertDialogFragment().show(supportFragmentManager, "abc")
        }





    }
}