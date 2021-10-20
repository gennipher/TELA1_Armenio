package br.edu.infnet.tela1_armenio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtNome = findViewById<EditText>(R.id.txtNome)
        val txtEmail = findViewById<EditText>(R.id.txtEmail)
        val txtFone = findViewById<EditText>(R.id.txtFone)
        //Essa função faz a ligação do objeto res+xml com o kotlin
        val btnSalvar = this.findViewById<Button>(R.id.btnSalvar)
        //Aqui estou criando uma função lambda e passando para o setOnClickListener
        btnSalvar.setOnClickListener {
            val txtResultado = findViewById<EditText>(R.id.txtResultado)
            txtResultado.setText(
                txtNome.text.toString() + "\n"
                        + txtEmail.text.toString() + "\n"
                        + txtFone.text.toString()
            )
        }
        val btnLimpar = findViewById<Button>(R.id.btnLimpar)
        btnLimpar.setOnClickListener {
            txtNome.setText(null)
            txtEmail.setText(null)
            txtFone.setText(null)
        }
    }
}