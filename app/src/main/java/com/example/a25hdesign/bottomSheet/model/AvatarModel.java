package com.example.a25hdesign.bottomSheet.model;

public class AvatarModel {
    private int imgAvartar;
    private int imgSmallIcon;
    private String name;

    public AvatarModel(int imgAvartar, int imgSmallIcon, String name) {
        this.imgAvartar = imgAvartar;
        this.imgSmallIcon = imgSmallIcon;
        this.name = name;
    }

    public int getImgAvartar() {
        return imgAvartar;
    }

    public void setImgAvartar(int imgAvartar) {
        this.imgAvartar = imgAvartar;
    }

    public int getImgSmallIcon() {
        return imgSmallIcon;
    }

    public void setImgSmallIcon(int imgSmallIcon) {
        this.imgSmallIcon = imgSmallIcon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
