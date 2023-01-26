package com.example.pr2s

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        val imageButton : ImageButton = findViewById(R.id.imageButton)
        val editText : EditText = findViewById(R.id.editTextTextPersonName)
        val editText2 : EditText = findViewById(R.id.editTextTextPersonName2)
        imageButton.setOnClickListener {
            if ((editText.text.isEmpty()) or (editText2.text.isEmpty())){
                textView.text = "Вводи что, да как"
                imageButton.setImageResource(R.drawable.img)
            }
            else if(editText2.text.toString().equals("Y") ) {
                textView.text = "Нормально, нормально, " + editText.text
                imageButton.setImageResource(R.drawable.img_3)
            }
            else if(editText2.text.toString().equals("N") ) {
                textView.text = "Бывает, " + editText.text
                imageButton.setImageResource(R.drawable.img_2)
            }
        }
    }
}