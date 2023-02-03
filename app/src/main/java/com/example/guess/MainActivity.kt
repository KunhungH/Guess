package com.example.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val secretNumber = SecretNumber()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity-onCreate", "secretNumber="+secretNumber)
    }

    fun check(view : View){
        var n = number2.text.toString().toInt()
        Log.d("MainActivity-check", "key-in="+n)
        var diff = secretNumber.validate(n)
        var msg="yes,you got it"
        if(diff < 0){
            msg="Bigger"
        }
        else if(diff >0){
            msg="Smaller"
        }
        //Toast.makeText(this, "", Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
            .setMessage(msg)
            .setPositiveButton("OK",null)
            .show()
    }
}