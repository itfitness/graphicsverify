package com.itfitness.verify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.itfitness.graphicsverify.GraphicsVerifyView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<GraphicsVerifyView>(R.id.verView).apply {
            verifyCallBack = object : GraphicsVerifyView.VerifyCallBack{
                override fun onSuccess() {
                    Toast.makeText(this@MainActivity,"成功",Toast.LENGTH_SHORT).show()
                }

                override fun onFail() {
                    Toast.makeText(this@MainActivity,"失败",Toast.LENGTH_SHORT).show()
//                    reset()
                }
            }
        }
    }
}