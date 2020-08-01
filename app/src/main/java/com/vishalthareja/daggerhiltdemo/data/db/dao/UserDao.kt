package com.vishalthareja.daggerhiltdemo.data.local.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.vishalthareja.daggerhiltdemo.data.local.db.entity.User

/**
 * @author Vishal Thareja
 */
@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User) : Long
}