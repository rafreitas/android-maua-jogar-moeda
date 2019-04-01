package com.raphael.meuprojetodejogarmoeda

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Cria uma função que muda de tela //val é para variável constante
    fun mudarDeTela(view : View){
        val intent = Intent(this, ResultadoActivity::class.java)
        startActivity(intent)
    }
}
