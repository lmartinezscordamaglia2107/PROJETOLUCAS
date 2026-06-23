package com.seuapp.gestaofit.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "members")
data class Member(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val phone: String,
    val email: String,
    val registrationDate: Long = System.currentTimeMillis(),
    val isActive: Boolean = true,
    val planId: Long? = null
)
