package com.insanegaming.mediafire

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBE = findViewById<Button>(R.id.btn_download_be)
        val btnRE = findViewById<Button>(R.id.btn_download_re)
        val credits = findViewById<TextView>(R.id.txt_credits)

        btnBE.setOnClickListener {
            val url = "https://www.mediafire.com/file/ik2if7mbq715jzv/BEN+10+V21+-+BE.mcaddon/file"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        btnRE.setOnClickListener {
            val url = "https://www.mediafire.com/file/yzf2mboaxtxl215/BEN+10+V21+-+RE.mcaddon/file"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        credits.text = "Credits: Insane Gaming"
    }
}
