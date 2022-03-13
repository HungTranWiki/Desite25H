package com.example.a25hdesign.favorite.shop;

public class ShopModel {
    private int shopImage;
    private String shopname;
    private String shopPrice;

    public ShopModel(int shopImage, String shopname, String shopPrice) {
        this.shopImage = shopImage;
        this.shopname = shopname;
        this.shopPrice = shopPrice;
    }

    public int getShopImage() {
        return shopImage;
    }

    public void setShopImage(int shopImage) {
        this.shopImage = shopImage;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(String shopPrice) {
        this.shopPrice = shopPrice;
    }
}
