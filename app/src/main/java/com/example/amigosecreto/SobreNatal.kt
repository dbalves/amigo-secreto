package com.example.amigosecreto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sobre_natal.*

class SobreNatal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre_natal)

        button_voltar.setOnClickListener {
            finish()
        }
    }

}