package com.example.dessertclicker.ui.main

import androidx.annotation.DrawableRes
import com.example.dessertclicker.data.Datasource.dessertList

data class MainUiState(
    val currentDessertIndex: Int = 0,
    val dessertsSold: Int = 0,
    val revenue: Int = 0,
    val currentDessertPrice: Int = dessertList[currentDessertIndex].price,
    @DrawableRes val currentDessertImageId: Int = dessertList[currentDessertIndex].imageId
)
