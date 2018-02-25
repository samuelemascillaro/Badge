package com.development.internal.badge.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import com.development.internal.badge.entity.WorkingDay

/**
 * Created by mascillaro on 25/02/2018.
 */
@Dao
interface WorkingDayDAO {
    @Insert
    fun insert(workingDay: WorkingDay)
}
