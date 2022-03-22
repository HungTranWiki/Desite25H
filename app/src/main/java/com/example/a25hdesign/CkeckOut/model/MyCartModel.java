package com.example.a25hdesign.CkeckOut.model;

public class MyCartModel {
    private int imgModel;
    private String nameOrdel;
    private String detailOrder;
    private String totalPrice;
    private String amountItem;

    public MyCartModel(int imgModel, String nameOrdel, String detailOrder, String totalPrice, String amountItem) {
        this.imgModel = imgModel;
        this.nameOrdel = nameOrdel;
        this.detailOrder = detailOrder;
        this.totalPrice = totalPrice;
        this.amountItem = amountItem;
    }

    public int getImgModel() {
        return imgModel;
    }

    public void setImgModel(int imgModel) {
        this.imgModel = imgModel;
    }

    public String getNameOrdel() {
        return nameOrdel;
    }

    public void setNameOrdel(String nameOrdel) {
        this.nameOrdel = nameOrdel;
    }

    public String getDetailOrder() {
        return detailOrder;
    }

    public void setDetailOrder(String detailOrder) {
        this.detailOrder = detailOrder;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAmountItem() {
        return amountItem;
    }

    public void setAmountItem(String amountItem) {
        this.amountItem = amountItem;
    }
}
