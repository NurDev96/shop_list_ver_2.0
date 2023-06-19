package com.example.shoplistver20.domain

interface ShopListRepository {
    fun getShopList(): List<ShopItem>
    fun getShopItem(shopItemId: Int): ShopItem
    fun editShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun addShopItem(shopItem: ShopItem)
}


