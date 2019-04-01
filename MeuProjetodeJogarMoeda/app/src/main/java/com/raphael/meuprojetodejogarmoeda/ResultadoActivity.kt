package com.raphael.meuprojetodejogarmoeda

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_resultado.*
import java.util.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        if(Random().nextInt(10) %2 == 0){
            textoResultado.text = "CARA"
            imagemResultado.setImageResource(R.drawable.cara)
        }else{
            textoResultado.text = "COROA"
            imagemResultado.setImageResource(R.drawable.coroa)
        }
    }

    fun voltar(view : View){
        finish()
    }
}
