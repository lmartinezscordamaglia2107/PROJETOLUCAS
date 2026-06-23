package com.seuapp.gestaofit.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transactions")
data class FinancialTransaction(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val memberId: Long?, // Nullable for general expenses
    val amount: Double,
    val date: Long = System.currentTimeMillis(),
    val description: String,
    val type: TransactionType
)

enum class TransactionType {
    INCOME, EXPENSE
}
