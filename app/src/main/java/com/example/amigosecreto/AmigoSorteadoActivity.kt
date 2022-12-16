package com.example.amigosecreto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_amigo_sorteado.*
import kotlinx.android.synthetic.main.activity_sobre_natal.*

class AmigoSorteadoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amigo_sorteado)

        val dados: Bundle? = intent.extras
        val nomeSorteado = dados?.getString("nome")
        val fotoSorteada = dados?.getString("fotoSorteada")

        nome.text = nomeSorteado
        if (fotoSorteada != null) {
            foto.setImageResource(fotoSorteada.toInt())
        }
        button_voltar2.setOnClickListener {
            finish()
        }
    }
}