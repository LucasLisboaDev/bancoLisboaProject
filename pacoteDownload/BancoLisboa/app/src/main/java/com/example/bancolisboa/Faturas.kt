package com.example.bancolisboa

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bancolisboa.databinding.ActivityFaturasBinding

class Faturas : AppCompatActivity() {
    private lateinit var binding: ActivityFaturasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFaturasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()  // Tag específica para esconder a barra de ação.

        val toolbar = binding.toolbarFaturas
        toolbar.title = "Faturas"
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