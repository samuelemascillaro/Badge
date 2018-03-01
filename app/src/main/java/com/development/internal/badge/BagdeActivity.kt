package com.development.internal.badge

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.View
import android.widget.Toast
import com.development.internal.badge.app.BadgeApplication
import com.development.internal.badge.entity.WorkingDay
import com.development.internal.badge.util.WorkingDayUtils
import kotlinx.android.synthetic.main.activity_bagde.*
import java.io.Console

class BagdeActivity : AppCompatActivity() {
    //Prova user
    //https://manijshrestha.wordpress.com/2017/06/03/using-room-with-kotlin/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bagde)
        var timeWhenStopped = 0L
        start.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(v?.context, "START!", Toast.LENGTH_LONG).show();
                chronometer.setBase(SystemClock.elapsedRealtime() + timeWhenStopped)
                chronometer.start()
            }
        })

        stop.setOnClickListener(
                object : View.OnClickListener {
                    override fun onClick(v: View?) {
                        Toast.makeText(v?.context, "STOP!", Toast.LENGTH_LONG).show();
                        timeWhenStopped = chronometer.base - SystemClock.elapsedRealtime();
                        chronometer.stop()
                    }
                })

        save.setOnClickListener(
            object : View.OnClickListener {
                override fun onClick(v: View?) {
                    Toast.makeText(v?.context, "SAVE", Toast.LENGTH_LONG).show()
                    Log.i("DB", "Saving...")
                    if(application is BadgeApplication){
                        Log.i("DB", "application is BadgeApplication")
                        val app=application as BadgeApplication
                        val db=app.getDB()
                        db?.workingDayDAO()?.insert(WorkingDay(WorkingDayUtils.getCurrentWorkingDay(),SystemClock.elapsedRealtime() - chronometer.getBase()))
                        Log.i("DB", applicationContext.getDatabasePath(app.DATABASE_NAME).absolutePath)
                    }
                }
            })
        }
}

