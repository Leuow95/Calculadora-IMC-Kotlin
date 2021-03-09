package com.example.calculadoraimc_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        Log.w("lifecycle", "entrei no CREATE - estou criando a tela")
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle", "entrei no START - deixei a tela visível")
    }
    override fun onResume() {
        super.onResume()
        Log.w("lifecycle", "entrei no RESUME - agora voce pode interagir com a tela")
    }
    override fun onPause() {
        super.onPause()
        Log.w("lifecycle", "entrei no PAUSE - a tela perdeu o foco, voce nao pode mais interagir")
    }
    override fun onStop() {
        super.onStop()
        Log.w("lifecycle", "entrei no STOP - a tela não está mais visível mas ainda existe")
    }
    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle", "entrei no RESTART - a tela esta retomando o foco")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecycle", "entrei no DESTROY - a tela foi destruída")
    }

}