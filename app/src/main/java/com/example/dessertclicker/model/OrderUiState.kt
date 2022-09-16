package com.example.dessertclicker.model

import androidx.annotation.DrawableRes
import com.example.dessertclicker.data.Datasource.dessertList

data class OrderUiState(
    val currentDessertIndex: Int = 0,
    val dessertsSold: Int = 0,
    val revenue: Int = 0,
    val currentDessertPrice: Int = dessertList[currentDessertIndex].price,
    @DrawableRes val currentDessertImageId: Int = dessertList[currentDessertIndex].imageId
)