package com.example.ejemplo_toast

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var ed1:EditText
    lateinit var ed2:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ed1=findViewById<EditText>(R.id.edN1)
        ed2=findViewById<EditText>(R.id.edN2)
    }
    fun promedio(view: View)
    {
        var strN1=ed1.text.toString()
        var strN2=ed2.text.toString()
        var promedio=(strN1.toDouble()+strN2.toDouble())/2
        if (promedio >=7)
        {
            Toast.makeText(this, "Aprobaste", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(this, "No Aprobaste", Toast.LENGTH_LONG).show()
        }

    }
}