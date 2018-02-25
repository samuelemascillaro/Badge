package com.development.internal.badge.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.development.internal.badge.dao.WorkingDayDAO
import com.development.internal.badge.entity.WorkingDay

/**
 * Created by mascillaro on 25/02/2018 based on https://medium.com/@tonyowen/a-room-with-a-view-getting-started-ec010f9f5448
 */
@Database(entities = arrayOf(WorkingDay::class), version = 1)
abstract class BadgeDatabase : RoomDatabase() {
        abstract fun workingDayDAO(): WorkingDayDAO
}