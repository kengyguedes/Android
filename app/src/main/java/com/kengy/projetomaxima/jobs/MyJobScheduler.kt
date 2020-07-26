package com.kengy.projetomaxima.jobs

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.job.JobInfo
import android.app.job.JobParameters
import android.app.job.JobScheduler
import android.app.job.JobService
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build
import android.util.Log
import com.kengy.projetomaxima.R
import com.kengy.projetomaxima.View.SplashScreen

class MyJobScheduler : JobService() {

    private var _TAG = "ExampleJobService"
    private var _jobCancelled = false
    lateinit var builder2: Notification.Builder
    private val channelId = "NOTIFICACAO_MAXIMA_TECH"


    override fun onStartJob(params: JobParameters?): Boolean {
        Log.i(_TAG, "Job startada")
        Thread({
            createNotificationChannel()
        }).start()

        jobFinished(params,true)
        return true

    }

    override fun onStopJob(params: JobParameters?): Boolean {
        return false
    }


    fun createNotificationChannel() {

        val intent = Intent(this, SplashScreen::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent: PendingIntent = PendingIntent.getActivity(this, 0, intent, 0)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = getString(R.string.channel_name)
            val descriptionText = getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(channelId, name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)


            builder2 = Notification.Builder(this, channelId)
                .setSmallIcon(R.mipmap.maxima_logotipo)
                .setContentTitle("Olá meu amigo!!")
                .setContentText("Não esqueça de acessar o Sistema Hoje")
                .setStyle(
                    Notification.BigTextStyle()
                        .bigText("Não esqueça de acessar o Sistema Hoje")
                )
                .setPriority(Notification.PRIORITY_DEFAULT)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)

            notificationManager.
                notify(1234, builder2.build())


        }
    }




}