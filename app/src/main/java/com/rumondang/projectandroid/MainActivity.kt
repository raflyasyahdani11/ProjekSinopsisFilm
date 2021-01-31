package com.rumondang.projectandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tampilan_depan)

        GlobalScope.launch {
            delay(3000L)
            startActivity(
                Intent(this@MainActivity, Login::class.java)
            )
        }
    }
}