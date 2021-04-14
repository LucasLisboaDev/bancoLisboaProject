package com.example.bancolisboa

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bancolisboa.databinding.ActivitySaldoBinding

class saldo : AppCompatActivity() {

        private lateinit var binding: ActivitySaldoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaldoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()  // Tag específica para esconder a barra de ação.

        val toolbar = binding.toolbarSaldo
        toolbar.title = "Saldo"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(400,0,400,0)
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        }
}