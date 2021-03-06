package com.development.internal.badge

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bagde.*

class BagdeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bagde)
        var  timeWhenStopped = 0L
        start.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(v?.context, "START!", Toast.LENGTH_LONG).show();
                chronometer.setBase(SystemClock.elapsedRealtime()+timeWhenStopped)
                chronometer.start()
            }
        })

        stop.setOnClickListener(object:View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(v?.context, "STOP!", Toast.LENGTH_LONG).show();
                timeWhenStopped=chronometer.base - SystemClock.elapsedRealtime();
                chronometer.stop()
            }
        })

    }
}
