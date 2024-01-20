package com.example.renzo_medina_seccioncurso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //función para obtener los datos del editext
        fun getAll(){
            val getName = findViewById<EditText>(R.id.label_food)
            val getStock = findViewById<EditText>(R.id.label_values)
            val getAddress = findViewById<EditText>(R.id.label_address)
            Log.v("Nombre Comida", getName.text.toString())
            Log.v("Cantidad:", getStock.text.toString())
            Log.v("Dirección", getAddress.text.toString())

        }

        //evento del boton
        val buttonPay = findViewById<Button>(R.id.button_pay)
        buttonPay.setOnClickListener {
            getAll()
        }

    }
}