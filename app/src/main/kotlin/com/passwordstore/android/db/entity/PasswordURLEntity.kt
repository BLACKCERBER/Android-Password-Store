package com.passwordstore.android.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "PasswordUrl",
        foreignKeys = [ForeignKey(
                entity = PasswordEntity::class,
                parentColumns = ["id"],
                childColumns = ["password_id"],
                onDelete = ForeignKey.CASCADE)
        ])
data class PasswordURLEntity (

        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")
        val id: Int,

        @ColumnInfo(name = "password_id")
        val storeId: Int,

        @ColumnInfo(name = "url")
        val url: String
)