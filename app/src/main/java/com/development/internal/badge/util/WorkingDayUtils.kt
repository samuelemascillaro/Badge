package com.development.internal.badge.util

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by mascillaro on 28/02/2018.
 */
class WorkingDayUtils{
    companion object {
        fun getCurrentWorkingDay():String {
            var c= Calendar.getInstance()
            return getWorkingDayByDate(c)
        }

        fun  getWorkingDayByDate(input: Calendar):String{
            val tf = SimpleDateFormat("yyyy-MM-dd")
            return tf.format(input.time)
        }
    }
}
