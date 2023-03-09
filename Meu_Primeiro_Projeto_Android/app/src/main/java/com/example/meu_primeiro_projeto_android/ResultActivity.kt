package com.example.meu_primeiro_projeto_android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val nomeDigitado = intent.getStringExtra("NOME_DIGITADO")

        val tvResulto = findViewById<TextView>(R.id.tvResultado)

        tvResulto.text = nomeDigitado
    }
}