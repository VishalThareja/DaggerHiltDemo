package com.vishalthareja.daggerhiltdemo.data.local.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author Vishal Thareja
 */
@Entity(tableName = "User")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "contact_number") val contact_number : String?,
    @ColumnInfo(name = "first_name") val first_name : String) {
}
