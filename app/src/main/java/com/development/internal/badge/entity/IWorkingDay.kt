package com.development.internal.badge.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

/**
 * Created by mascillaro on 25/02/2018.
 */
@Entity(tableName = "workingday")
data class WorkingDay(
    @PrimaryKey
    @ColumnInfo(name ="day")
    val date : Date
)