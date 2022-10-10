package com.example.cuthbert_flashcardapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView

class AddCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_card)

        findViewById<View>(R.id.back_button).setOnClickListener {
            finish()
        }


        val questionEditText = findViewById<EditText>(R.id.editQuestion)
        val answerEditText = findViewById<EditText>(R.id.editAnswer)


        val saveButton = findViewById<ImageView>(R.id.saveButton)
        saveButton.setOnClickListener {


            val questionString = questionEditText.text.toString()
            val answerString = answerEditText.text.toString()

            val data = Intent()
            data.putExtra("string1", questionString)
            data.putExtra("string2", answerString)


            setResult(RESULT_OK, data)
            finish()
        }


    }
}
