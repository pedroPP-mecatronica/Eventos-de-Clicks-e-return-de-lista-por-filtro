package com.example.appmotivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_aplash.*

class SplashActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aplash)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        buttonsave.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        val id = view?.id
        if (id == R.id.buttonsave) {
            handleSave()
        }
    }

    private fun handleSave() {
        val name = editName.text.toString()

        if (name != "") {
            startActivity(Intent(this, MainActivity::class.java))
        } else {
            Toast.makeText(this, "Informe seu nome", Toast.LENGTH_SHORT).show()
        }
    }
}