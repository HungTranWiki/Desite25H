package com.example.a25hdesign.bottomSheet.model;

public class buttonModel {
    private String title;
    int imgIcon;

    public buttonModel(String title, int imgIcon) {
        this.title = title;
        this.imgIcon = imgIcon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgIcon() {
        return imgIcon;
    }

    public void setImgIcon(int imgIcon) {
        this.imgIcon = imgIcon;
    }
}
