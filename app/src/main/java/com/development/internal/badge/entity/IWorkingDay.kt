package com.development.internal.badge.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.lang.reflect.Constructor
import java.util.*

/**
 * Created by mascillaro on 25/02/2018.
 */

@Entity(tableName = "workingday")
data class WorkingDay(@ColumnInfo(name = "day") var day: String, @ColumnInfo(name = "time") var time: Long) {
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true) var id: Long = 0
}