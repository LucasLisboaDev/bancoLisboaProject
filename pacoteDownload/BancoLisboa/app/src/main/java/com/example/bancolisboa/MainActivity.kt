package com.example.bancolisboa

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bancolisboa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saldo.setOnClickListener {
        val intent = Intent(this,saldo::class.java )    // Intent é usada para navegar para a página onde eu quero ir IMPORTANTE
            startActivity(intent)   // começão a atividade com a intenção de ir para outra tela
            finish() // EVENTO DE CLICK
        }

        binding.faturas.setOnClickListener {
            val intent = Intent ( this, Faturas::class.java)
            startActivity(intent)
            finish()
        }

        binding.transferencia.setOnClickListener {
            val intent = Intent ( this, Transferencia::class.java)
            startActivity(intent)
            finish()
        }

        binding.poupanca.setOnClickListener {
            val intent = Intent (this, Poupanca::class.java)
            startActivity(intent)
            finish()
        }
    }
}