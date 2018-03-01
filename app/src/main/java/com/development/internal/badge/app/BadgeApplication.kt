package com.development.internal.badge.app

import android.app.Application
import android.arch.persistence.room.Room
import com.development.internal.badge.db.BadgeDatabase


/**
 * Created by mascillaro on 28/02/2018.
 */
class BadgeApplication : Application() {

    var database: BadgeDatabase? = null
    val DATABASE_NAME="BadgeDB.db"

    companion object {
        lateinit var INSTANCE: BadgeApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        // create database
        database = Room.databaseBuilder(
                applicationContext,
                BadgeDatabase::class.java,
                DATABASE_NAME)
                .allowMainThreadQueries()
                .build()
        INSTANCE = this
    }

    fun getDB(): BadgeDatabase? {
        return database
    }
}