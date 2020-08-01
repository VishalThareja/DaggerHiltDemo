package com.vishalthareja.daggerhiltdemo.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.vishalthareja.daggerhiltdemo.data.local.db.dao.UserDao
import com.vishalthareja.daggerhiltdemo.data.local.db.entity.User

/**
 * @author Vishal Thareja
 */
@Database(entities = [User::class],version = 1, exportSchema = false)
abstract class TestingDatabase : RoomDatabase() {

    abstract fun getUserDao() : UserDao
}