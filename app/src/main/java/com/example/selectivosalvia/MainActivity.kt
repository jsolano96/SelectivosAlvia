package com.example.selectivosalvia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    startTimer()
}

fun startTimer() {
    object : CountDownTimer(3000, 1000){
        override fun onTick(p0: Long) {

        }

        override fun onFinish() {
            TODO("Not yet implemented")
            val login = Intent(applicationContext,LoginActivity::class.java).apply {}
            startActivity(login)
        }


    }.start()
}
}