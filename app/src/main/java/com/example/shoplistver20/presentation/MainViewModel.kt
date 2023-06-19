package com.example.shoplistver20.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoplistver20.data.ShopListRepositoryImpl
import com.example.shoplistver20.domain.*

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val editShopItemUseCase = EditShopItemUseCase(repository)
    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()


    fun deleteShopItem(shopItem: ShopItem) {
        val item = deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun editShopItem(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}
