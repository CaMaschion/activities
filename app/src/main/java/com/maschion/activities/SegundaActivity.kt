package com.maschion.activities

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SegundaActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val nome = intent.getStringExtra("NOME")

        val textView: TextView = findViewById(R.id.texto2)
        textView.text = "Nome enviado:$nome"

        val btnClose : Button = findViewById(R.id.button2)
        btnClose.setOnClickListener {
            finish()
        }
    }
}