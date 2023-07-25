package com.example.mad_practical_2_21012021053__

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);


    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart() method is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume() method is called")
    }
    fun showMessage(msg:String){
      Log.i(TAG,"$msg")
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }
}