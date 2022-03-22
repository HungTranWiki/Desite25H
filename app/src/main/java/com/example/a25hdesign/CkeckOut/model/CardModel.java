package com.example.a25hdesign.CkeckOut.model;

public class CardModel {
    private String nameCard;
    private String numberCard;
    private String expireDate;

    public CardModel(String nameCard, String numberCard, String expireDate) {
        this.nameCard = nameCard;
        this.numberCard = numberCard;
        this.expireDate = expireDate;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
}
