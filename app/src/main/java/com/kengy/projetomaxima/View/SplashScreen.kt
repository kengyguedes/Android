package com.kengy.projetomaxima.View

import android.app.ActivityManager
import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.app.job.JobWorkItem
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.kengy.projetomaxima.R
import com.kengy.projetomaxima.jobs.MyJobScheduler

class SplashScreen : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_splash_screen)

        scheduleJob1()

        Handler().postDelayed({
            startActivity(
                Intent(
                    this@SplashScreen,
                    MenuPrincipal::class.java
                )
            )
            finish()
        }, 4000)

    }


    fun scheduleJob1() {
        val componentName = ComponentName(this, MyJobScheduler::class.java)
        val info = JobInfo.Builder(1234, componentName)
            .setPersisted(true)
            .setPeriodic(15*60*1000)
            .setBackoffCriteria(5*60*1000,JobInfo.BACKOFF_POLICY_LINEAR)
            .build()
        val scheduler = getSystemService(JOB_SCHEDULER_SERVICE) as JobScheduler
        val resultCode = scheduler.schedule(info)
        if (resultCode == JobScheduler.RESULT_SUCCESS) {
            Log.d("", "Job scheduled")
        } else {
            Log.d("", "Job scheduling failed")
        }
        
    }


}
