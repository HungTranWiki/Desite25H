package com.example.a25hdesign.bottomSheet.model;

public class AppModel {
    private int imgApp;
    String title;

    public AppModel(int imgApp, String title) {
        this.imgApp = imgApp;
        this.title = title;
    }

    public int getImgApp() {
        return imgApp;
    }

    public void setImgApp(int imgApp) {
        this.imgApp = imgApp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
