package com.example.amigosecreto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val nomes = arrayListOf<String>("Sonia", "Rose", "Paulo", "Fernando", "Alice",
        "Lucimara", "Luciana", "Fabio", "Bernardo", "Nicollas", "Douglas"
    )

    private val fotos = arrayListOf<Int>(R.drawable.sonia, R.drawable.rose, R.drawable.paulo,
        R.drawable.fernando, R.drawable.alice, R.drawable.lucimara, R.drawable.luciana,
        R.drawable.fabio, R.drawable.bernardo, R.drawable.nicollas, R.drawable.douglas
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_conhecer_historia.setOnClickListener{
            val intent = Intent(applicationContext,SobreNatal::class.java)
            startActivity(intent)
        }

        button_sortear_amigo.setOnClickListener{
            val totalItensArrayNome = nomes.size
            val numeroAleatorio = Random.nextInt(totalItensArrayNome)

            val nome = nomes[numeroAleatorio]
            val foto: String = fotos[numeroAleatorio].toString()

            if( nomes.size <= 1 ){
                button_sortear_amigo.isActivated = false
                button_sortear_amigo.isClickable = false
                button_sortear_amigo.isEnabled = false
            }

            nomes.removeAt(numeroAleatorio)
            fotos.removeAt(numeroAleatorio)



            val intent = Intent(applicationContext,AmigoSorteadoActivity::class.java)
            intent.putExtra("nome", nome)
            intent.putExtra("numeroSorteado", numeroAleatorio)
            intent.putExtra("fotoSorteada", foto)
            startActivity(intent)
        }
    }

}