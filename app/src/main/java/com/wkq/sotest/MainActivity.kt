package com.wkq.sotest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.wkq.cdemo.MyJniUtil
import com.wkq.jnidemo.JniUtil


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tv_content).text=  MyJniUtil.stringFromJNI()
       var isNet= JniUtil.HancNetInit()
        Log.e("初始化:",isNet.toString())
    }
}