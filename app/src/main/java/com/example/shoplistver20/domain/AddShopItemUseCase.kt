package com.example.shoplistver20.domain

class AddShopItemUseCase(private val addShopItemUseCase: ShopListRepository) {
    fun addShopItem(shopItem: ShopItem) {
        addShopItemUseCase.addShopItem(shopItem)
    }
}