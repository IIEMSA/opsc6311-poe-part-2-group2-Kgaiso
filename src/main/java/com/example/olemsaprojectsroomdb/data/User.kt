package com.example.olemsaprojectsroomdb.data

import androidx.room.Entity
import androidx.room.PrimaryKey

//User
@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val username: String,
    val password: String)