package com.example.intentbelajar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity(),View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btnclick:Button = findViewById(R.id.btnclick)
        btnclick.setOnClickListener(this)




    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnclick -> {
                val move = Intent(this@MainActivity2, MainActivity::class.java)
                startActivity(move)

            }

        }
    }
}
