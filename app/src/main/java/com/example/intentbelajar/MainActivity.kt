package com.example.intentbelajar

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnclick:Button = findViewById(R.id.btnclick)
        btnclick.setOnClickListener(this)
        val btndata:Button=findViewById(R.id.btnmove)
        btndata.setOnClickListener(this)
        val dialbtn:Button=findViewById(R.id.dialbtn)
        dialbtn.setOnClickListener(this)

                }
      override fun onClick(v:View){
        when(v.id){
            R.id.btnclick ->{
                val move = Intent(this@MainActivity,MainActivity2::class.java)
                startActivity(move)

}           R.id.btnmove -> {
              val moveWithDataIntent = Intent(this@MainActivity,
                  movedata::class.java)

              moveWithDataIntent.putExtra(movedata.EXTRA_NAME,
                  "riga the kid")

              moveWithDataIntent.putExtra(movedata.EXTRA_AGE, 17)
            moveWithDataIntent.putExtra(movedata.EXTRA_ADDRESS, "ngunut city")
            moveWithDataIntent.putExtra(movedata.EXTRA_GENDER, "lanang")
              startActivity(moveWithDataIntent)

                            }
            R.id.dialbtn-> {
                val PhoneNumber="0858585858"
                val dialIntent= Intent(Intent.ACTION_DIAL, Uri.parse("tel:$PhoneNumber"))
                startActivity(dialIntent)
      }


    }
    }
}