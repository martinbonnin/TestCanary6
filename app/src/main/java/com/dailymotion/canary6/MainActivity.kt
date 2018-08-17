package com.dailymotion.canary6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.Worker
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PeriodicWorkRequestBuilder<MyWorker>(1L, TimeUnit.HOURS)
    }

    class MyWorker: Worker() {
        override fun doWork(): Result {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
}
