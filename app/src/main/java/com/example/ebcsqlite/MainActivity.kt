package com.example.ebcsqlite

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCambiarColor: Button = findViewById(R.id.btn_principal)
        val txtPrincipal : EditText = findViewById(R.id.et_txt_principal)

        btnCambiarColor.setOnClickListener{
            txtPrincipal.setTextColor(android.graphics.Color.GREEN)
       }
    }
    fun cambiarTexto(view: View){
        val etPrincipal : EditText = findViewById(R.id.et_txt_principal)
        val txtPrincipal: TextView = findViewById(R.id.tv_txt_principal)

        txtPrincipal.setText(etPrincipal.text)
    }
}