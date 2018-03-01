package com.development.internal.badge.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import com.development.internal.badge.entity.WorkingDay

/**
 * Created by mascillaro on 25/02/2018.
 */
@Dao
interface WorkingDayDAO {
    @Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    fun insert(workingDay: WorkingDay)

    @Update(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    fun update(workingDay: WorkingDay)

    @Query("select * from workingday")
    fun getAllWDs(): List<WorkingDay>
}
