package com.example.a25hdesign.Support.model;

public class ItemSupportModel {
    String title;
    String content;
    boolean readed;

    public ItemSupportModel(String title, String content, boolean readed) {
        this.title = title;
        this.content = content;
        this.readed = readed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }
}
